package com.example.a192168328.myapplication.Model;

/**
 * Created by 192.168.3.28 on 26-Feb-17.
 */

public class UserPostRequest {
    UserDetail userDetail= new UserDetail();

    private String mUserName = userDetail.getFname() +" "+ userDetail.getLname();

    public String getmUserBloodGroup() {
        return mUserBloodGroup;
    }

    public String getmUserName() {
        return mUserName;
    }

    private String mUserBloodGroup = userDetail.getBloodGroup();
    private int mNumberOfUnits;
    private String mRequiredBloodGroup;
    private String mLocationWithPatient;
    private String mRelationWithPatient;
    private boolean mUrgency;
    private int mContact;
    private String mAdditinalInstruction;
    private int mVolunteersToDonate;
    private int mCurrentlyRequird;

    public UserPostRequest(int numunits, String requiredBloodGroup,
                           String  LocationWithPatient, String RelationWithPatient,boolean Urgency,int Contact,
                           String additinalInstruction){
        mNumberOfUnits = numunits;
        mRequiredBloodGroup = requiredBloodGroup;
        mLocationWithPatient  = LocationWithPatient;
        mRelationWithPatient = RelationWithPatient;
        mUrgency = Urgency;
        mContact = Contact;
        mAdditinalInstruction = additinalInstruction;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public int getmNumberOfUnits() {
        return mNumberOfUnits;
    }

    public String getmRequiredBloodGroup() {
        return mRequiredBloodGroup;
    }

    public String getmLocationWithPatient() {
        return mLocationWithPatient;
    }

    public String getmRelationWithPatient() {
        return mRelationWithPatient;
    }

    public boolean ismUrgency() {
        return mUrgency;
    }

    public int getmContact() {
        return mContact;
    }

    public String getmAdditinalInstruction() {
        return mAdditinalInstruction;
    }

    public int getmVolunteersToDonate() {
        return mVolunteersToDonate;
    }

    public int getmCurrentlyRequird() {
        return mCurrentlyRequird;
    }
}
