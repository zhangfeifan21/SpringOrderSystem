package org.zyf.product.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zyf.common.utils.R;

@FeignClient("order")
public interface OrderFeignService {

}
