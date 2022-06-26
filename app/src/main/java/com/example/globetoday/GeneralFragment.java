package com.example.globetoday;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class GeneralFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.news_list,container,false);
        ArrayList<News> arrayList = new ArrayList<News>();
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));
        arrayList.add(new News("Doctor told her sex was painful because of her age. It turned out to be ovarian cancer","Mara Kofoed and A. Pawlowski","url","Mara Kofoed, 45, was diagnosed with ovarian cancer in December 2021 after months trying to figure out vague and seemingly unrelated symptoms. She found doctors dismissed them at every turn and didn’t connect them to a tumor. It took a visit to an emergency room to finally get answers. Kofoed, who lives in Hudson Valley, New York, shared her story with TODAY.","23/09/1232",R.drawable.ic_launcher_foreground));

        NewsListAdapter newsListAdapter = new NewsListAdapter(getActivity() ,arrayList);

        ListView newsListView =(ListView) rootView.findViewById(R.id.list);

        newsListView.setAdapter(newsListAdapter);
        return rootView;

    }

}