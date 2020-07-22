package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 10:07:25
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
