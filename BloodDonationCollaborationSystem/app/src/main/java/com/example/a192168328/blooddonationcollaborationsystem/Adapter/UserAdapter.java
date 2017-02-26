package com.example.a192168328.blooddonationcollaborationsystem.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.a192168328.blooddonationcollaborationsystem.Model.UserDetail;
import com.example.a192168328.blooddonationcollaborationsystem.R;

import java.util.List;

/**
 * Created by 192.168.3.28 on 26-Feb-17.
 */

public class UserAdapter extends ArrayAdapter<UserDetail>

    {



        public UserAdapter(Context context, int resource, List<UserDetail> users) {
        super(context, resource,users);
    }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.userlist,parent,false);

        }
return convertView;
    }

    }
