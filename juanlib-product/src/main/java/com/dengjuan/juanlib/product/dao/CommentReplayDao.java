package com.dengjuan.juanlib.product.dao;

import com.dengjuan.juanlib.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author dengjuan
 * @email dengjuan0721@gmail.com
 * @date 2024-06-06 23:07:08
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
