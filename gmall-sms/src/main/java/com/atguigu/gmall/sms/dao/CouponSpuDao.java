package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:13:08
 */
@Mapper
public interface CouponSpuDao extends BaseMapper<CouponSpuEntity> {
	
}
