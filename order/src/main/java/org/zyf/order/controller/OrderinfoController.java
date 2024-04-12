package org.zyf.order.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.zyf.order.entity.OrderinfoEntity;
import org.zyf.order.entity.OrderlistEntity;
import org.zyf.order.service.OrderinfoService;
import org.zyf.common.utils.PageUtils;
import org.zyf.common.utils.R;



/**
 * 
 *
 * @author Zhang Yifei
 * @email 1426107672@qq.com
 * @date 2024-04-12 01:35:00
 */
@RestController
@RequestMapping("order/orderinfo")
public class OrderinfoController {
    @Autowired
    private OrderinfoService orderinfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:orderinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderinfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:orderinfo:info")
    public R info(@PathVariable("id") Long id){
		OrderinfoEntity orderinfo = orderinfoService.getById(id);

        return R.ok().put("orderinfo", orderinfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:orderinfo:save")
    public R save(@RequestBody OrderinfoEntity orderinfo){
		orderinfoService.save(orderinfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:orderinfo:update")
    public R update(@RequestBody OrderinfoEntity orderinfo){
		orderinfoService.updateById(orderinfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:orderinfo:delete")
    public R delete(@RequestBody Long[] ids){
		orderinfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
