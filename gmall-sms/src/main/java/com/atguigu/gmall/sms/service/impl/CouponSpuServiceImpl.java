package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gmall.sms.dao.CouponSpuDao;
import com.atguigu.gmall.sms.entity.CouponSpuEntity;
import com.atguigu.gmall.sms.service.CouponSpuService;


@Service("couponSpuService")
public class CouponSpuServiceImpl extends ServiceImpl<CouponSpuDao, CouponSpuEntity> implements CouponSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuEntity> page = this.page(
                new Query<CouponSpuEntity>().getPage(params),
                new QueryWrapper<CouponSpuEntity>()
        );

        return new PageUtils(page);
    }

}