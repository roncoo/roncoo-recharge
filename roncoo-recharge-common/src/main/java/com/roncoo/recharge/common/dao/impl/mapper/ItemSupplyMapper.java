/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.ItemSupply;
import com.roncoo.recharge.common.entity.ItemSupplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemSupplyMapper {
    int countByExample(ItemSupplyExample example);

    int deleteByExample(ItemSupplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemSupply record);

    int insertSelective(ItemSupply record);

    List<ItemSupply> selectByExample(ItemSupplyExample example);

    ItemSupply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemSupply record, @Param("example") ItemSupplyExample example);

    int updateByExample(@Param("record") ItemSupply record, @Param("example") ItemSupplyExample example);

    int updateByPrimaryKeySelective(ItemSupply record);

    int updateByPrimaryKey(ItemSupply record);
}
