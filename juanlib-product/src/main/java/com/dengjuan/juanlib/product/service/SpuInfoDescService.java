package com.dengjuan.juanlib.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dengjuan.common.utils.PageUtils;
import com.dengjuan.juanlib.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author dengjuan
 * @email dengjuan0721@gmail.com
 * @date 2024-06-06 23:07:08
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

