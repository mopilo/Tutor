package com.vyrenmedia.tutor;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

/**
 * The main activity for the dictionary.
 * Displays search results triggered by the search dialog and handles
 * actions from search suggestions.
 */
public class Dictionary extends Activity {

    private TextView mTextView;
    private ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mTextView = (TextView) findViewById(R.id.text);
        mListView = (ListView) findViewById(R.id.list);

        Intent intent = getIntent();

        if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            // handles a click on a search suggestion; launches activity to show word
            Intent wordIntent = new Intent(this, WordActivity.class);
            wordIntent.setData(intent.getData());
            startActivity(wordIntent);
            finish();
        } else if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            // handles a search query
            String query = intent.getStringExtra(SearchManager.QUERY);
            showResults(query);
        }
    }

    /**
     * Searches the dictionary and displays results for the given query.
     * @param query The search query
     */
    private void showResults(String query) {

        Cursor cursor = managedQuery(DictionaryProvider.CONTENT_URI, null, null,
                new String[] {query}, null);

        if (cursor == null) {
            // There are no results
            mTextView.setText(getString(R.string.no_results, new Object[] {query}));
        } else {
            // Display the number of results
            int count = cursor.getCount();
            String countString = getResources().getQuantityString(R.plurals.search_results,
                    count, new Object[] {count, query});
            mTextView.setText(countString);

            // Specify the columns we want to display in the result
            String[] from = new String[] { DictionaryDatabase.KEY_WORD,
                    DictionaryDatabase.KEY_DEFINITION };

            // Specify the corresponding layout elements where we want the columns to go
            int[] to = new int[] { R.id.word,
                    R.id.definition };

            // Create a simple cursor adapter for the definitions and apply them to the ListView
            SimpleCursorAdapter words = new SimpleCursorAdapter(this,
                    R.layout.result, cursor, from, to);
            mListView.setAdapter(words);

            // Define the on-click listener for the list items
            mListView.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    // Build the Intent used to open WordActivity with a specific word Uri
                    Intent wordIntent = new Intent(getApplicationContext(), WordActivity.class);
                    Uri data = Uri.withAppendedPath(DictionaryProvider.CONTENT_URI,
                            String.valueOf(id));
                    wordIntent.setData(data);
                    startActivity(wordIntent);
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                onSearchRequested();
                return true;
            default:
                return false;
        }
    }
}