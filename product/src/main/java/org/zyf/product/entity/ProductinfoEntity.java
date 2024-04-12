package org.zyf.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhangyifei
 * @email 1426107672@qq.com
 * @date 2024-04-11 23:55:03
 */
@Data
@TableName("pms_productinfo")
public class ProductinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String productName;

}
