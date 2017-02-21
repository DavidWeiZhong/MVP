package com.mvp.bean;

/**
 * Created by ${邱伟中} on 2017/2/19 0019.下午 3:37
 */
public class UserBean {

    private String mFirstName;
    private String mLastName;

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public UserBean(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }
}
