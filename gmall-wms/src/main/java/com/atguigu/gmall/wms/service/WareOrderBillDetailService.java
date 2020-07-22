package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.wms.entity.WareOrderBillDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:06:15
 */
public interface WareOrderBillDetailService extends IService<WareOrderBillDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

