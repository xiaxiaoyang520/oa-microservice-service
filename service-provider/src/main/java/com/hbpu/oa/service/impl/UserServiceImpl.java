package com.hbpu.oa.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hbpu.oa.domain.bl.UserBL;
import com.hbpu.oa.model.User;
import com.hbpu.oa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户服务接口实现类
 * @author 晓阳
 * 2017年1月14日下午10:57:05
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserBL userBL;


	@Override
	public User login(String userTel, String userPassword) {
		return userBL.userLogin(userTel, userPassword);
	}

	
}
