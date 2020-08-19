package com.hbpu.oa.domain.dao;

import com.hbpu.oa.model.Permit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Permit映射接口
 * @author 晓阳
 * 2017年1月14日下午9:25:14
 */
@Mapper
public interface PermitPOMapper {

	/**
	 * 通过条件查询审核列表信息
	 * @param paramMap
	 * @return
	 */
	List<Permit> findPermitList(Map<String, Object> paramMap);
	
	/** 
	 * 获取记录总数
	 * @param paramMap
	 * @return Integer
	 */
	Integer getPermitListNum(Map<String, Object> paramMap);
	
	/** 
	 * 插入审核信息
	 * @param permit
	 * @return Integer
	 */
	Integer addPermit(Permit permit);
	
	/** 
	 * 修改审核信息（审核）
	 * @param permit
	 * @return void
	 */
	void updatePermit(Permit permit);
	
	/**
	 * 通过id查询审核信息
	 * @param permitId
	 */
	Permit queryPermitById(Integer permitId);
	
}
