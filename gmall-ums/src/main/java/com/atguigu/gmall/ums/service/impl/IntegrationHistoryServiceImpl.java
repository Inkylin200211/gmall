package com.atguigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gmall.ums.dao.IntegrationHistoryDao;
import com.atguigu.gmall.ums.entity.IntegrationHistoryEntity;
import com.atguigu.gmall.ums.service.IntegrationHistoryService;


@Service("integrationHistoryService")
public class IntegrationHistoryServiceImpl extends ServiceImpl<IntegrationHistoryDao, IntegrationHistoryEntity> implements IntegrationHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IntegrationHistoryEntity> page = this.page(
                new Query<IntegrationHistoryEntity>().getPage(params),
                new QueryWrapper<IntegrationHistoryEntity>()
        );

        return new PageUtils(page);
    }

}