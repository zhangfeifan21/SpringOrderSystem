package org.zyf.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zyf.common.utils.R;

@FeignClient("product")
public interface ProductFeignService {

    @RequestMapping("/product/productinfo/orderProduct/list")
    public R orderProducts();
}
