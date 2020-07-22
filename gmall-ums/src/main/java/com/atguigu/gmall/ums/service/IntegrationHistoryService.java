package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.ums.entity.IntegrationHistoryEntity;

import java.util.Map;

/**
 * 购物积分记录表
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:12:23
 */
public interface IntegrationHistoryService extends IService<IntegrationHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

