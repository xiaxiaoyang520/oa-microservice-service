package com.hbpu.oa.domain.dao;

import com.hbpu.oa.model.Speech;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * SpeechMapper接口
 * 
 * @author 晓阳 2017年1月15日下午4:05:04
 */
@Mapper
public interface SpeechPOMapper {

	/**
	 * 通过条件查询言论列表
	 * 
	 * @param paramMap
	 * @return
	 */
	List<Speech> findSpeechList(Map<String, Object> paramMap);

	/**
	 * 获取列表记录数
	 * 
	 * @param paramMap
	 * @return Integer
	 */
	Integer getSpeechListNum(Map<String, Object> paramMap);

	/**
	 * 添加言论信息
	 * 
	 * @param speech
	 * @return
	 */
	Integer addSpeech(Speech speech);

	/**
	 * 删除言论信息
	 * 
	 * @param speechId
	 */
	void deleteSpeech(Integer speechId);

	/**
	 * 点赞
	 * 
	 * @return void
	 */
	void addPraiseNum(Integer speechId);

}
