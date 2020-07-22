package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.pms.entity.SpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 10:07:25
 */
public interface SpuService extends IService<SpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

