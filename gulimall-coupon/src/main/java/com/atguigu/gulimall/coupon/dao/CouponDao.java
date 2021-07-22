package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yjc
 * @email yjc@gmail.com
 * @date 2021-07-22 16:59:12
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
