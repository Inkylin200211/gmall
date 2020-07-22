package com.atguigu.gmall.ums.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gmall.ums.entity.UserAddressEntity;
import com.atguigu.gmall.ums.service.UserAddressService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 收货地址表
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:12:23
 */
@RestController
@RequestMapping("ums/useraddress")
public class UserAddressController {
    @Autowired
    private UserAddressService userAddressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ums:useraddress:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userAddressService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ums:useraddress:info")
    public R info(@PathVariable("id") Long id){
		UserAddressEntity userAddress = userAddressService.getById(id);

        return R.ok().put("userAddress", userAddress);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ums:useraddress:save")
    public R save(@RequestBody UserAddressEntity userAddress){
		userAddressService.save(userAddress);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ums:useraddress:update")
    public R update(@RequestBody UserAddressEntity userAddress){
		userAddressService.updateById(userAddress);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ums:useraddress:delete")
    public R delete(@RequestBody Long[] ids){
		userAddressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
