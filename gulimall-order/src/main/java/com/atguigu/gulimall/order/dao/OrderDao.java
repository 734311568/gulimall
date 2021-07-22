package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yjc
 * @email yjc@gmail.com
 * @date 2021-07-22 17:40:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
