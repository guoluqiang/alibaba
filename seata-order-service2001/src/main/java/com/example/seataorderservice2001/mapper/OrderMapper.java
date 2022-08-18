package com.example.seataorderservice2001.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seataorderservice2001.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
