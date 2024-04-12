package org.zyf.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * 
 * @author Zhang Yifei
 * @email 1426107672@qq.com
 * @date 2024-04-12 01:35:00
 */
@Data
@TableName("oms_orderinfo")
public class OrderinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long customerId;
	/**
	 * 
	 */
	private LocalDateTime orderTime;

}
