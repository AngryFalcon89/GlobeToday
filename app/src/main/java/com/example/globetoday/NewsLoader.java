package com.example.globetoday;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.content.AsyncTaskLoader;
import android.util.Log;

import java.util.List;
/**
 * Loads a list of News by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class NewsLoader extends AsyncTaskLoader<List<News>> {

    /** Tag for log messages */
    private static final String LOG_TAG = NewsLoader.class.getName();

    private String TECH_URL ;
    private String GENERAL_URL ;
    private String POLITICS_URL ;
    private String SPORTS_URL ;
    /**
     * Constructs a new {@link NewsLoader}.
     *
     * @param context of the activity
     * @param general_url to load data from
     */
    public NewsLoader(@NonNull Context context,String general_url) {
        super(context);
        GENERAL_URL=general_url;
        Log.e("NewsLoader constructor", "is ended", null);
    }

    @Override
    protected void onStartLoading() {
        Log.e("onStartLoad", ": Force load", null);
        forceLoad();
    }

    /**
     *This is on background thread
     */
    @Nullable
    @Override
    public List<News> loadInBackground() {
        if (GENERAL_URL== null) {
            return null;
        }
        Log.e("NewsLoader", "NewsLoader started: Load in background", null);
        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<News> news = QueryUtils.fetchNewsData(GENERAL_URL);
        return news;
    }
}
