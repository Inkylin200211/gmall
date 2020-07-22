package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SeckillSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:13:08
 */
@Mapper
public interface SeckillSkuDao extends BaseMapper<SeckillSkuEntity> {
	
}
