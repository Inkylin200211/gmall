package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.wms.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-24 18:00:13
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

