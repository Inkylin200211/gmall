package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.pms.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-24 17:57:24
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

