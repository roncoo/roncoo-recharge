/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.OrderTrade;
import com.roncoo.recharge.common.entity.OrderTradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderTradeMapper {
    int countByExample(OrderTradeExample example);

    int deleteByExample(OrderTradeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderTrade record);

    int insertSelective(OrderTrade record);

    List<OrderTrade> selectByExample(OrderTradeExample example);

    OrderTrade selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderTrade record, @Param("example") OrderTradeExample example);

    int updateByExample(@Param("record") OrderTrade record, @Param("example") OrderTradeExample example);

    int updateByPrimaryKeySelective(OrderTrade record);

    int updateByPrimaryKey(OrderTrade record);
}
