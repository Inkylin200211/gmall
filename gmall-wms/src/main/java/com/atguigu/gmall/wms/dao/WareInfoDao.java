package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-24 18:00:13
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
