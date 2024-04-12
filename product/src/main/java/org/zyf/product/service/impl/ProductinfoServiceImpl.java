package org.zyf.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zyf.common.utils.PageUtils;
import org.zyf.common.utils.Query;

import org.zyf.product.dao.ProductinfoDao;
import org.zyf.product.entity.ProductinfoEntity;
import org.zyf.product.service.ProductinfoService;


@Service("productinfoService")
public class ProductinfoServiceImpl extends ServiceImpl<ProductinfoDao, ProductinfoEntity> implements ProductinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductinfoEntity> page = this.page(
                new Query<ProductinfoEntity>().getPage(params),
                new QueryWrapper<ProductinfoEntity>()
        );

        return new PageUtils(page);
    }

}