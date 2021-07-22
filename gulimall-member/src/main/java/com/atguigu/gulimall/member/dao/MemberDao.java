package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yjc
 * @email yjc@gmail.com
 * @date 2021-07-22 17:23:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
