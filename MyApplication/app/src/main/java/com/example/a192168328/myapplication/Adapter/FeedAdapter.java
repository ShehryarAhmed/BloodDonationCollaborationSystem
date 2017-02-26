package com.example.a192168328.myapplication.Adapter;

import android.content.Context;
import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.a192168328.myapplication.Model.UserPostRequest;
import com.example.a192168328.myapplication.R;
import com.example.a192168328.myapplication.databinding.Feed_Binding;

import java.util.ArrayList;

/**
 * Created by 192.168.3.28 on 26-Feb-17.
 */

public class FeedAdapter extends ArrayAdapter<UserPostRequest> {
    private Context context;
    public FeedAdapter(Context context, ArrayList<UserPostRequest> userPostRequests) {
        super(context, 0, userPostRequests);
        this.context = context;
    }
    Feed_Binding feed_binding ;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitemView = convertView;
        feed_binding = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.feedlayout,parent,false);
        if(listitemView == null){
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.feedlayout,parent,false); }
        UserPostRequest postRequest = getItem(position);
        feed_binding.feedUserName.setText( postRequest.getmUserName());

        feed_binding.feedUnitsNgroup.setText(postRequest.getmNumberOfUnits() +" Units Of " +postRequest.getmUserBloodGroup()
                                        +"Blood Required"
        );
        feed_binding.feedLocationNrelation.setText("At "+postRequest.getmLocationWithPatient() +
                " "+postRequest.getmRelationWithPatient());
        feed_binding.feedAdditionInstruction.setText(postRequest.getmAdditinalInstruction());
        return listitemView;
    }
}
