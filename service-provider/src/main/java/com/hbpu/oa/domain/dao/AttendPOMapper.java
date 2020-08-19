package com.hbpu.oa.domain.dao;

import com.hbpu.oa.model.Attend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Attend映射接口
 * @author 晓阳
 * 2017年1月14日下午9:25:14
 */
@Mapper
public interface AttendPOMapper {

	/**
	 * 通过条件分页查询考勤列表信息
	 * @param paramMap
	 * @return
	 */
	List<Attend> findAttendList(Map<String, Object> paramMap);
	
	/**
	 * 通过条件分页查询考勤列表信息数量
	 * @param paramMap
	 * @return
	 */
	Integer getAttendListNum(Map<String, Object> paramMap);
	
	
	/**
	 * 插入用户考勤信息
	 * @param attend
	 * @return
	 */
	Integer addAttend(Attend attend);
	
	/** 
	 * 给考勤信息添加备注信息
	 * @param paramMap
	 * @return void
	 */
	void addRemark(Map<String, Object> paramMap);
	
}
