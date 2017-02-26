package com.example.a192168328.myapplication.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.a192168328.myapplication.Model.UserDetail;
import com.example.a192168328.myapplication.R;


import org.w3c.dom.UserDataHandler;

import java.util.List;

/**
 * Created by 192.168.3.28 on 26-Feb-17.
 */

public class UserAdapter extends ArrayAdapter<UserDetail>

    {
        TextView mFirstName;
        TextView mBloodGroup;




        public UserAdapter(Context context, int resource, List<UserDetail> users) {
        super(context, resource,users);
    }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.userlist,parent,false);

        }
            UserDetail mUserDetail = getItem(position);
            mFirstName = (TextView) convertView.findViewById(R.id.FirstName);
            mBloodGroup = (TextView) convertView.findViewById(R.id.BloodGroup);

            mFirstName.setText(mUserDetail.getFname());

            mBloodGroup.setText(mUserDetail.getBloodGroup());
            return convertView;
    }

    }
