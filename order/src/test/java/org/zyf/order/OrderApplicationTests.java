package org.zyf.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zyf.order.entity.OrderinfoEntity;
import org.zyf.order.entity.OrderlistEntity;
import org.zyf.order.service.OrderinfoService;
import org.zyf.order.service.OrderlistService;

import java.time.LocalDateTime;
import java.time.LocalTime;


@SpringBootTest
class OrderApplicationTests {
    @Autowired
    OrderinfoService orderinfoService;
    @Autowired
    OrderlistService orderlistService;

    @Test
    void contextLoads() {
        OrderinfoEntity orderinfoEntity = new OrderinfoEntity();
        LocalDateTime currentTime = LocalDateTime.now();
        orderinfoEntity.setOrderTime(currentTime);
//        orderinfoEntity.setCustomerId(369L);
        orderinfoService.save(orderinfoEntity);
//        OrderlistEntity orderlistEntity = new OrderlistEntity();
//        orderlistEntity.setOrderId(1L);
//        orderlistService.save(orderlistEntity);
        System.out.println("保存成功。。。");
    }

}