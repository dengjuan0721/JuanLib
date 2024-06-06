package com.dengjuan.juanlib.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dengjuan.common.utils.PageUtils;
import com.dengjuan.juanlib.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author dengjuan
 * @email dengjuan0721@gmail.com
 * @date 2024-06-06 23:07:08
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

