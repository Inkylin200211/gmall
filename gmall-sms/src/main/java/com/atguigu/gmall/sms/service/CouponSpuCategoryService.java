package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.sms.entity.CouponSpuCategoryEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:13:08
 */
public interface CouponSpuCategoryService extends IService<CouponSpuCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

