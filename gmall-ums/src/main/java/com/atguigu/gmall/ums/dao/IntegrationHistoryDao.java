package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.IntegrationHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 购物积分记录表
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:12:23
 */
@Mapper
public interface IntegrationHistoryDao extends BaseMapper<IntegrationHistoryEntity> {
	
}
