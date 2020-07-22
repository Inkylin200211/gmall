package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:06:15
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
