package com.hbpu.oa.domain.dao;

import com.hbpu.oa.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User映射接口
 * @author 晓阳
 * 2017年1月14日下午9:25:14
 */
@Mapper
public interface CommentPOMapper {

	/**
	 * 通过言论id查看评论列表信息
	 * @param speechId
	 * @return
	 */
	List<Comment> findCommentList(@Param("speechId") Integer speechId);

	/** 
	 * 添加评论
	 * @param comment
	 * @return void
	 */
	Integer addComment(Comment comment);
	
}
