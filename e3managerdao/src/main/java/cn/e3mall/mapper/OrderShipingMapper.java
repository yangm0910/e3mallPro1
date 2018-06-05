package cn.e3mall.mapper;

import cn.e3mall.pojo.OrderShiping;
import cn.e3mall.pojo.OrderShipingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderShipingMapper {
    long countByExample(OrderShipingExample example);

    int deleteByExample(OrderShipingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderShiping record);

    int insertSelective(OrderShiping record);

    List<OrderShiping> selectByExample(OrderShipingExample example);

    OrderShiping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OrderShiping record, @Param("example") OrderShipingExample example);

    int updateByExample(@Param("record") OrderShiping record, @Param("example") OrderShipingExample example);

    int updateByPrimaryKeySelective(OrderShiping record);

    int updateByPrimaryKey(OrderShiping record);
}