package com.dengjuan.juanlib.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dengjuan.common.utils.PageUtils;
import com.dengjuan.juanlib.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author dengjuan
 * @email dengjuan0721@gmail.com
 * @date 2024-06-06 23:07:08
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

