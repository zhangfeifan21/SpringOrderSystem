package org.zyf.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zyf.common.utils.PageUtils;
import org.zyf.product.entity.ProductinfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhangyifei
 * @email 1426107672@qq.com
 * @date 2024-04-11 23:55:03
 */
public interface ProductinfoService extends IService<ProductinfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

