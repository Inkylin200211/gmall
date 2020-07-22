package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.BrandEntity;
import com.atguigu.gmall.pms.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();

        entity.setName("善恶浮世真假界");
        brandService.save(entity);

    }

}
