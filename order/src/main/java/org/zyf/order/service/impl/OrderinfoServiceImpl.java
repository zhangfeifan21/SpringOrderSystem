package org.zyf.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zyf.common.utils.PageUtils;
import org.zyf.common.utils.Query;

import org.zyf.order.dao.OrderinfoDao;
import org.zyf.order.entity.OrderinfoEntity;
import org.zyf.order.service.OrderinfoService;


@Service("orderinfoService")
public class OrderinfoServiceImpl extends ServiceImpl<OrderinfoDao, OrderinfoEntity> implements OrderinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderinfoEntity> page = this.page(
                new Query<OrderinfoEntity>().getPage(params),
                new QueryWrapper<OrderinfoEntity>()
        );

        return new PageUtils(page);
    }

}