package com.atguigu.gmall.ums.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName SmsService
 * @Description TODO
 * @Author Inkylin
 * @Date 2020/7/22 17:04
 **/

//声明式远程调用

@FeignClient("pms-service")
public interface SmsService {

    @RequestMapping("/pms/brand/add")
    public R addbrand();

}
