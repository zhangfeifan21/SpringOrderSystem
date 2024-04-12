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

import org.zyf.order.entity.OrderlistEntity;
import org.zyf.order.service.OrderlistService;
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
@RequestMapping("order/orderlist")
public class OrderlistController {
    @Autowired
    private OrderlistService orderlistService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:orderlist:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderlistService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:orderlist:info")
    public R info(@PathVariable("id") Long id){
		OrderlistEntity orderlist = orderlistService.getById(id);

        return R.ok().put("orderlist", orderlist);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:orderlist:save")
    public R save(@RequestBody OrderlistEntity orderlist){
		orderlistService.save(orderlist);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:orderlist:update")
    public R update(@RequestBody OrderlistEntity orderlist){
		orderlistService.updateById(orderlist);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:orderlist:delete")
    public R delete(@RequestBody Long[] ids){
		orderlistService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
