package com.hbpu.oa.domain.dao;

import com.hbpu.oa.model.PraiseRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * PraiseRecordPOMapper接口
 * @author 晓阳
 * 2017年4月14日下午11:15:23
 */
@Mapper
public interface PraiseRecordPOMapper {

	/**
     * 新增点赞记录
     * @param praiseRecord
     */
    void addPraiseRecord(PraiseRecord praiseRecord);

	/**
	 * 查询是否存在点赞记录
	 * @param speechId
	 * @param userId
	 */
	Integer queryPraiseRecord(@Param("speechId") Integer speechId, @Param("userId") Integer userId);

	/**
	 * 获取言论的点赞列表
	 * @param speechId
	 */
	List<PraiseRecord> findPraiseRecordListBySpeechId(@Param("speechId") Integer speechId);
	
}
