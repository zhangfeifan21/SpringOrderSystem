package org.zyf.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 远程调用模块
 * 1. 引入Open feign
 * 2. 编写接口 (feign package)
 * 3. 声明方法对应的请求
 * 4. 开启远程调用功能
 */
@EnableFeignClients(basePackages = "org.zyf.order.feign")
@MapperScan("org.zyf.order.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(org.zyf.order.OrderApplication.class, args);
    }

}
