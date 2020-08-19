package com.hbpu.oa.domain.bl;

import com.hbpu.oa.domain.dao.UserPOMapper;
import com.hbpu.oa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户 BL类
 * 
 * @author 晓阳 2017年1月14日下午9:03:53
 */
@Service
@Transactional
public class UserBL {

	@Autowired
	private UserPOMapper userPOMapper;

	/**
	 * 用户登录
	 * 
	 * @param userTel
	 * @param userPassword
	 * @return
	 */
	public User userLogin(String userTel, String userPassword) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userTel", userTel);
		paramMap.put("userPassword", userPassword);
		return userPOMapper.userLogin(paramMap);
	}

}
