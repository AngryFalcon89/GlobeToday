package com.example.globetoday;

import android.app.LoaderManager;
import android.content.Loader;
import android.app.LoaderManager.LoaderCallbacks;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class SportsFragment extends Fragment implements LoaderManager.LoaderCallbacks<List<News>> {
    public static final String GENERAL_URL="https://saurav.tech/NewsAPI/top-headlines/category/sports/in.json";
    private NewsListAdapter mAdapter;
    private static final int SPORT_NEWS_LOADER_ID = 2;
    /** TextView that is displayed when the list is empty */
    private TextView mEmptyStateTextView;

    /** Tag for log messages */
    private static final String LOG_TAG = NewsLoader.class.getName();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(LOG_TAG, "onCreate of Sports fragment : initLoader Started", null);
        getActivity().getLoaderManager().initLoader(2, null, this);
        Log.e(LOG_TAG, "onCreate of sports : initLoader Ended", null);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.news_list,container,false);

        mAdapter = new NewsListAdapter(getActivity() ,new ArrayList<News>());

        ListView newsListView =(ListView) rootView.findViewById(R.id.list);

        newsListView.setAdapter(mAdapter);

        return rootView;

    }

    @Override
    public Loader<List<News>> onCreateLoader(int id, Bundle args) {
        //Create a new loader for the given URL
        Log.e("onCrreateLoader", "on Create Loader started", null);
        return new NewsLoader(getActivity(),GENERAL_URL);

    }

    @Override
    public void onLoadFinished(Loader<List<News>> loader, List<News> news) {

        Log.e(LOG_TAG, "onLoadFinished of sports fragment : adapter not set", null);
        View loadingIndicator = getView().findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);
        Log.e(LOG_TAG, "onLoadFinished: indicator gone", null);
        mEmptyStateTextView = (TextView) getView().findViewById(R.id.empty_view);
        // Set empty state text to display "No earthquakes found."
        mEmptyStateTextView.setText(R.string.no_news);
        // Clear the adapter of previous earthquake data
        mAdapter.clear();
        // Hide loading indicator because the data has been loaded
        // If there is a valid list of {@link Earthquake}s, then add them to the adapter's
        // data set. This will trigger the ListView to update.
        if (news != null && !news.isEmpty()) {
            mEmptyStateTextView.setVisibility(View.GONE);
            Log.e(LOG_TAG, "onLoadFinished: adapterSet", null);
            mAdapter.addAll(news);
            switch(loader.getId()) {
                case SPORT_NEWS_LOADER_ID:
                    Log.e(LOG_TAG, "Loader destroyed of sport Fragment: initiated  ", null);
                    // Loader reset, so we can clear out our existing data.
                    getActivity().getLoaderManager().destroyLoader(2);
                    Log.e(LOG_TAG, "Loader destroyed of sport Fragment : successfully", null);
                    break;
                default:
                    break;
            }
            return;
        }
    }

    @Override
    public void onLoaderReset(Loader<List<News>> loader) {
        switch(loader.getId()){
            case SPORT_NEWS_LOADER_ID:
                Log.e(LOG_TAG, "onLoaderReset of Sports Fragment: initiated  ",null );
                // Loader reset, so we can clear out our existing data.
                mAdapter.clear();
                Log.e(LOG_TAG, "onLoaderReset of Sports Fragment : mAdapter Cleared",null );
                break;
            default:
                break;
        }
    }
}