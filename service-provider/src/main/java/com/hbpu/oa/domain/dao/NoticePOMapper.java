package com.hbpu.oa.domain.dao;

import com.hbpu.oa.model.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


/**
 *  NoticePOMapper接口
 * @author 晓阳
 * 2017年4月16日下午3:19:19
 */
@Mapper
public interface NoticePOMapper {

	/**
	 * 通过条件查询通知和公告
	 * 
	 * @param paramMap
	 * @return
	 */
	List<Notice> findNoticeList(Map<String, Object> paramMap);

	/**
	 * 获取列表记录数
	 * 
	 * @param paramMap
	 * @return Integer
	 */
	Integer getNoticeListNum(Map<String, Object> paramMap);

	/**
	 * 发布通知和公告
	 * @param notice
	 */
	Integer addNotice(Notice notice);

	/**
	 * 主键获取详情
	 * @param noticeId
	 */
	Notice queryNoticeById(Integer noticeId);

}
