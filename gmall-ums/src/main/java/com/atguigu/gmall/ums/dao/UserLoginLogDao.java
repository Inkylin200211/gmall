package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.UserLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登陆记录表
 * 
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:12:23
 */
@Mapper
public interface UserLoginLogDao extends BaseMapper<UserLoginLogEntity> {
	
}
