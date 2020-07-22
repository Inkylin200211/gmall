package com.atguigu.gmall.wms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gmall.wms.dao.WareOrderBillDao;
import com.atguigu.gmall.wms.entity.WareOrderBillEntity;
import com.atguigu.gmall.wms.service.WareOrderBillService;


@Service("wareOrderBillService")
public class WareOrderBillServiceImpl extends ServiceImpl<WareOrderBillDao, WareOrderBillEntity> implements WareOrderBillService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderBillEntity> page = this.page(
                new Query<WareOrderBillEntity>().getPage(params),
                new QueryWrapper<WareOrderBillEntity>()
        );

        return new PageUtils(page);
    }

}