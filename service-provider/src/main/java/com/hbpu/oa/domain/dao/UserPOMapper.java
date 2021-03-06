package com.hbpu.oa.domain.dao;

import com.hbpu.oa.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * User映射接口
 * @author 晓阳
 * 2017年1月14日下午9:25:14
 */
@Mapper
@Repository
public interface UserPOMapper {

	/**
	 * 通过条件分页查询用户列表信息
	 * @param paramMap
	 * @return
	 */
	List<User> findUserList(Map<String, Object> paramMap);
	
	/**
	 * 通过条件分页查询用户列表信息数量
	 * @param paramMap
	 * @return
	 */
	Integer getUserListNum(Map<String, Object> paramMap);
	
	/**
	 * 用户登录
	 * @param paramMap
	 * @return
	 */
	User userLogin(Map<String, Object> paramMap);
	
	/**
	 * 通过主键查询用户详细信息
	 * @param userId
	 * @return
	 */
	User selectByKey(Integer userId);
	
	/**
	 * 插入用户信息
	 * @param user
	 * @return
	 */
	Integer addUser(User user);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	void updateUser(User user);
	
	/**
	 * 删除用户信息
	 * @param userId
	 * @return
	 */
	void deleteUser(Integer userId);
	
	/**
	 * 检查用户手机号是否重复
	 * @param userTel
	 * @return
	 */
	Integer checkUserTel(@Param("userTel") String userTel);

	/** 
	 * 获取所有用户信息
	 * @return
	 * @return List<User>
	 */
	List<User> findAllUserList();
	
	/** 
	 * 通过用户名查询用户信息
	 * @param userName
	 */
	User queryUserByName(@Param("userName") String userName);
	
	User checkPwd(@Param("userId") Integer userId, @Param("oldPwd") String oldPwd);
}
