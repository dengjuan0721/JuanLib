package com.dengjuan.juanlib.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dengjuan.common.utils.PageUtils;
import com.dengjuan.juanlib.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author dengjuan
 * @email dengjuan0721@gmail.com
 * @date 2024-06-06 23:07:08
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

