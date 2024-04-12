package org.zyf.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zyf.common.utils.PageUtils;
import org.zyf.common.utils.Query;

import org.zyf.order.dao.OrderlistDao;
import org.zyf.order.entity.OrderlistEntity;
import org.zyf.order.service.OrderlistService;


@Service("orderlistService")
public class OrderlistServiceImpl extends ServiceImpl<OrderlistDao, OrderlistEntity> implements OrderlistService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderlistEntity> page = this.page(
                new Query<OrderlistEntity>().getPage(params),
                new QueryWrapper<OrderlistEntity>()
        );

        return new PageUtils(page);
    }

}