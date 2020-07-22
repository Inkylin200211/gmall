package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.wms.entity.WareEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:06:16
 */
public interface WareService extends IService<WareEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

