package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-24 17:59:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
