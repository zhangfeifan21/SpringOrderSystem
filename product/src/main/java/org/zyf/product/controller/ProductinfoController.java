package org.zyf.product.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.zyf.product.entity.ProductinfoEntity;
import org.zyf.product.service.ProductinfoService;
import org.zyf.common.utils.PageUtils;
import org.zyf.common.utils.R;



/**
 * 
 *
 * @author zhangyifei
 * @email 1426107672@qq.com
 * @date 2024-04-11 23:55:03
 */
@RestController
@RequestMapping("product/productinfo")
public class ProductinfoController {
    @Autowired
    private ProductinfoService productinfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:productinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productinfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:productinfo:info")
    public R info(@PathVariable("id") Long id){
		ProductinfoEntity productinfo = productinfoService.getById(id);

        return R.ok().put("productinfo", productinfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:productinfo:save")
    public R save(@RequestBody ProductinfoEntity productinfo){
		productinfoService.save(productinfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:productinfo:update")
    public R update(@RequestBody ProductinfoEntity productinfo){
		productinfoService.updateById(productinfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:productinfo:delete")
    public R delete(@RequestBody Long[] ids){
		productinfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
