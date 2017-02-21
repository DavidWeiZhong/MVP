package com.mvp.model;

import com.mvp.bean.UserBean;

/**
 * Created by ${邱伟中} on 2017/2/19 0019.下午 3:38
 */
public interface IUserModle {

    void setId(int id);

    int getId();

    void setFirstName(String firstName);

    void setLastNmae(String lastNmae);

    UserBean load(int id);//通过id获取user信息，返回一个UserBean
}
