package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:13:08
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
