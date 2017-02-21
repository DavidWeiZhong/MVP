package com.mvp.presenter;

import android.util.Log;

import com.mvp.bean.UserBean;
import com.mvp.model.IUserModle;
import com.mvp.model.UserModle;
import com.mvp.view.IUserView;

/**
 * Created by ${邱伟中} on 2017/2/19 0019.下午 3:39
 */
public class UserPresenter {

    private IUserView mIUserView;

    private IUserModle mIUserModle;

    public UserPresenter(IUserView view) {
        this.mIUserView = view;
        this.mIUserModle = new UserModle();
    }

    public void saveUser(int id, String firstName, String lastName) {

        Log.d("print", "----->>>>>userPresenter.saveUser()");

        mIUserModle.setId(id);

        mIUserModle.setFirstName(firstName);

        mIUserModle.setLastNmae(lastName);

    }

    public void loadUser(int id) {

        UserBean user = mIUserModle.load(id);

        mIUserView.setLastNmae(user.getFirstName());//哈哈

        mIUserView.setFirstName(user.getLastName());//额
    }
}
