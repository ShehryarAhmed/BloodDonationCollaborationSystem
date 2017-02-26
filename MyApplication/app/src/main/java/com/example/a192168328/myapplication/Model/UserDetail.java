package com.example.a192168328.myapplication.Model;

/**
 * Created by 192.168.3.28 on 26-Feb-17.
 */

public class UserDetail {
    private String fname;
    private String lname;
    private String email;
    private String psk;
    private String bloodGroup;

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPsk(String psk) {
        this.psk = psk;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public UserDetail(String fname, String lname, String email, String psk, String bloodGroup) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.psk = psk;
        this.bloodGroup = bloodGroup;
    }

    public UserDetail(){}
    public String getFname() {

        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPsk() {
        return psk;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
}