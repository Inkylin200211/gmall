package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.ums.entity.UserAddressEntity;

import java.util.Map;

/**
 * 收货地址表
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:12:23
 */
public interface UserAddressService extends IService<UserAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

