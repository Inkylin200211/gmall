package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @ClassName das
 * @Description TODO
 * @Author Inkylin
 * @Date 2020/7/24 9:55
 **/
@Configuration
public class GmallCorsConfiguration {


    @Bean
    public CorsWebFilter corsWebFilter(){

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration cors = new CorsConfiguration();

        //TODO 记得把renren项目里的跨域Corsconfig删掉

//        1.配置跨域
        cors.addAllowedHeader("*");
        cors.addAllowedMethod("*");
        cors.addAllowedOrigin("*");
        cors.setAllowCredentials(true);


        source.registerCorsConfiguration("/**", cors);

        return  new CorsWebFilter(source);
    }



}
