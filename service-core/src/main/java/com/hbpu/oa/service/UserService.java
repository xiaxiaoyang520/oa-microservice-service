package com.hbpu.oa.service;

import com.hbpu.oa.model.User;


public interface UserService {

    User login(String userTel, String userPassword);


}
