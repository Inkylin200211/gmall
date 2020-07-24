package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-24 17:58:40
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
