package org.zyf.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zyf.common.utils.PageUtils;
import org.zyf.order.entity.OrderinfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author Zhang Yifei
 * @email 1426107672@qq.com
 * @date 2024-04-12 01:35:00
 */
public interface OrderinfoService extends IService<OrderinfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

