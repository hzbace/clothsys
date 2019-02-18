package com.qianfeng.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.qianfeng.pojo.Order;
import com.qianfeng.vo.orderVo;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    List<orderVo> selectAllOrder();
    
    List<orderVo> selectOrder(@Param("userName") String userName, @Param("orderStatus") Integer orderStatus);
    
    Integer updateStatus(Integer orderId);
    
    @Select("select max(order_id) from db_order")
    @ResultType(Integer.class)
    int getMaxOrderId();
}