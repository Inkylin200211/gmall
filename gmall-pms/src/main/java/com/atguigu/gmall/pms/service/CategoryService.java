package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gmall.pms.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author kylin
 * @email kylin@gmail.com
 * @date 2020-07-24 17:57:24
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void removeMenuByIds(List<Long> asList);

    void updateCascade(CategoryEntity category);

    List<CategoryEntity> listWithTree();
}

