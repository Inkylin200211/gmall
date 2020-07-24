package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-24 18:00:13
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
