package com.nikhil.ReadIt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsData>{


        public NewsAdapter(Context context, ArrayList<NewsData> arrayList) {
            super(context, 0, arrayList);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View currentListView = convertView;

            if (currentListView == null) {
                currentListView = LayoutInflater.from(getContext()).inflate(
                        R.layout.custom_list_view, parent, false);
            }

            NewsData newsData = getItem(position);

            TextView titleView = currentListView.findViewById(R.id.titleOfNews);
            titleView.setText(newsData.getTitle());

            TextView sectionNameView = currentListView.findViewById(R.id.sectionName);
            sectionNameView.setText(newsData.getSectionName());

            TextView dateView = currentListView.findViewById(R.id.date);
            dateView.setText(newsData.getDate());

            TextView timeView = currentListView.findViewById(R.id.time);
            timeView.setText(newsData.getTime());

            TextView authorView = currentListView.findViewById(R.id.authorName);
            authorView.setText("~" + newsData.getAuthor());

            return currentListView;


        }
    }
