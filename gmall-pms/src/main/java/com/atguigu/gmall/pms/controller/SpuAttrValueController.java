package com.atguigu.gmall.pms.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gmall.pms.entity.SpuAttrValueEntity;
import com.atguigu.gmall.pms.service.SpuAttrValueService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * spu属性值
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-22 12:11:34
 */
@RestController
@RequestMapping("pms/spuattrvalue")
public class SpuAttrValueController {
    @Autowired
    private SpuAttrValueService spuAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pms:spuattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("pms:spuattrvalue:info")
    public R info(@PathVariable("id") Long id){
		SpuAttrValueEntity spuAttrValue = spuAttrValueService.getById(id);

        return R.ok().put("spuAttrValue", spuAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pms:spuattrvalue:save")
    public R save(@RequestBody SpuAttrValueEntity spuAttrValue){
		spuAttrValueService.save(spuAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pms:spuattrvalue:update")
    public R update(@RequestBody SpuAttrValueEntity spuAttrValue){
		spuAttrValueService.updateById(spuAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pms:spuattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		spuAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
