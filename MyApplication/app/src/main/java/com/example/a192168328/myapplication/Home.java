package com.example.a192168328.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.a192168328.myapplication.Adapter.FeedAdapter;
import com.example.a192168328.myapplication.Model.UserPostRequest;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.listview ,container,false);
        // Inflate the layout for this fragment
        ArrayList<UserPostRequest> arrayList = new ArrayList<>();
        arrayList.add(new UserPostRequest(3,"A+","At Saylani With Asher","Friend",true,031320,"plz contact"));
        FeedAdapter feedAdapter = new FeedAdapter(getActivity(),arrayList);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(feedAdapter);
        return rootview;
    }

}
