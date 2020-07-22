package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:10:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
