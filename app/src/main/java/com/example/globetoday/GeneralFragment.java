package com.example.globetoday;

import android.app.LoaderManager;
import android.content.Loader;
import android.app.LoaderManager.LoaderCallbacks;
import android.os.Bundle;
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
public class GeneralFragment extends Fragment implements LoaderManager.LoaderCallbacks<List<News>> {
    public static final String GENERAL_URL="https://saurav.tech/NewsAPI/top-headlines/category/general/in.json";
    private NewsListAdapter mAdapter;
    private static final int NEWS_LOADER_ID = 1;
    /** TextView that is displayed when the list is empty */
    private TextView mEmptyStateTextView;

    /** Tag for log messages */
    private static final String LOG_TAG = NewsLoader.class.getName();
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);

//    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          View rootView = inflater.inflate(R.layout.news_list,container,false);

//        ArrayList<News> arrayList = new ArrayList<News>();
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
//        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        Log.e(LOG_TAG, "onCreateView: initLoader Started", null);
        getActivity().getLoaderManager().initLoader(0, null, this);
        Log.e(LOG_TAG, "onCreateView: initLoader Ended", null);
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

        Log.e(LOG_TAG, "onLoadFinished: adapter not set", null);
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
            return;
        }
    }

    @Override
    public void onLoaderReset(Loader<List<News>> loader) {
        // Loader reset, so we can clear out our existing data.
        mAdapter.clear();
    }
}