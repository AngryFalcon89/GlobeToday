package com.example.globetoday;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.content.AsyncTaskLoader;

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
     * @param tech_url to load data from
     */
    public NewsLoader(@NonNull Context context,String politics_url,String sports_url,String general_url,String tech_url) {
        super(context);
        TECH_URL=tech_url;
        GENERAL_URL=general_url;
        SPORTS_URL=sports_url;
        POLITICS_URL=politics_url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     *This is on background thread
     */
    @Nullable
    @Override
    public List<News> loadInBackground() {
        if (TECH_URL== null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<News> news = QueryUtils.fetchNewsData(TECH_URL);
        return news;
    }
}
