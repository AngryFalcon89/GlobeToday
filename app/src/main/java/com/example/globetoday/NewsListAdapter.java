package com.example.globetoday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class NewsListAdapter extends ArrayAdapter<News> {

    /**
     * Create a new {@link NewsListAdapter} object.
     *  @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param news           is the list of {@link News}s to be displayed.*/
    public NewsListAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the {@link News} object located at this position in the list
        News currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID headline.
        TextView Headline = (TextView) listItemView.findViewById(R.id.Headline);
        // Get the Headlines of News from Internet and set it on
        // the headline TextView.
        Headline.setText(currentWord.getHeading());

        // Find the TextView in the list_item.xml layout with the ID subheading.
        TextView content = (TextView) listItemView.findViewById(R.id.content);
        // Get the subheading of news from internet and set it on
        // the SubHeading TextView.
        content.setText(currentWord.getArticle());

        // Find the TextView in the list_item.xml layout with the ID date.
        TextView Date = (TextView) listItemView.findViewById(R.id.date);
        // Get the News date and set it on
        // the Date TextView.
        Date.setText(currentWord.getDate());

        // Find the TextView in the list_item.xml layout with the ID author.
        TextView Author = (TextView) listItemView.findViewById(R.id.Author);
        // Get the News date and set it on
        // the Date TextView.
        Author.setText(currentWord.getAuthorName());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.Image);
        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        //Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        //the ListView.
        return listItemView;
    }
}
