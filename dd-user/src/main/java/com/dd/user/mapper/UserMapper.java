package com.dd.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dd.user.entity.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserPo> {

    UserPo getTest();
}
