package com.el.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author roman zhangfei
 * @Date 2019/12/4 17:00
 * @Version V1.0
 */
@Mapper
@Component
public interface OrderDao {

    /**
     *
     * @param price 价格
     * @param userId 用户ID
     * @param status 状态
     * @return
     */
    @Insert("insert into t_order(price,user_id,status)values(#{price},#{userId},#{status})")
    int insertOrder(@Param("price")BigDecimal price,@Param("userId")Long userId,@Param("status")String status);

    /**
     * 根据id列表查询订单
     * @param orderIds
     * @return
     */
    @Select("<script>" +
            "select" +
            " * " +
            " from t_order t " +
            " where t.order_id in " +
            " <foreach collection='orderIds' open='(' separator=',' close=')' item='id'>" +
            " #{id} " +
            " </foreach>" +
            " and t.user_id = #{userId}"+
            "</script>")
    List<Map> selectOrderbyIds(@Param("orderIds") List<Long> orderIds,@Param("userId") Integer userId);

}