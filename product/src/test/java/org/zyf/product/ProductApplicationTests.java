package org.zyf.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zyf.product.entity.ProductinfoEntity;
import org.zyf.product.service.ProductinfoService;

@SpringBootTest
class ProductApplicationTests {
	@Autowired
	ProductinfoService productinfoService;

	@Test
	void contextLoads() {
		ProductinfoEntity productEntity = new ProductinfoEntity();
//		productEntity.setProductName("螺蛳粉");
//		productinfoService.save(productEntity);
//		System.out.println("保存成功。。。");
		productEntity.setProductName("热干面");

		productinfoService.updateById(productEntity);
	}

}
