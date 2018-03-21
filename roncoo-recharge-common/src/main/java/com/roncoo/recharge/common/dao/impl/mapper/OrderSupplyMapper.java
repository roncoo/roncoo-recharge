/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.OrderSupply;
import com.roncoo.recharge.common.entity.OrderSupplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderSupplyMapper {
    int countByExample(OrderSupplyExample example);

    int deleteByExample(OrderSupplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderSupply record);

    int insertSelective(OrderSupply record);

    List<OrderSupply> selectByExample(OrderSupplyExample example);

    OrderSupply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderSupply record, @Param("example") OrderSupplyExample example);

    int updateByExample(@Param("record") OrderSupply record, @Param("example") OrderSupplyExample example);

    int updateByPrimaryKeySelective(OrderSupply record);

    int updateByPrimaryKey(OrderSupply record);
}
