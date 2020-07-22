package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.pms.entity.SkuAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 10:07:25
 */
public interface SkuAttrValueService extends IService<SkuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

