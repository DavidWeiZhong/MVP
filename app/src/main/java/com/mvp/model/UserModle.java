package com.mvp.model;

import com.mvp.bean.UserBean;

/**
 * Created by ${邱伟中} on 2017/2/19 0019.下午 3:38
 */
public class UserModle implements IUserModle {
    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public void setLastNmae(String lastNmae) {

    }

    @Override
    public UserBean load(int id) {
        return new UserBean("伟中", "大伟");
    }
}
