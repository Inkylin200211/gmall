package com.atguigu.gmall.pms.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gmall.pms.entity.BrandEntity;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 品牌
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:11:34
 */
@RestController
@RequestMapping("pms/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;



    @RequestMapping("/add")
    public R addbrand(){
//        添加品牌
        BrandEntity entity = new BrandEntity();
        entity.setName("华为荣耀");
        boolean save = brandService.save(entity);

        return R.ok().put("result", save);

    }



    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pms:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("pms:brand:info")
    public R info(@PathVariable("id") Long id){
		BrandEntity brand = brandService.getById(id);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pms:brand:save")
    public R save(@RequestBody BrandEntity brand){
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pms:brand:update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pms:brand:delete")
    public R delete(@RequestBody Long[] ids){
		brandService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
