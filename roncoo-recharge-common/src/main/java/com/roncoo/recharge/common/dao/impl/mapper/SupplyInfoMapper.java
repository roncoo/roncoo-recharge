/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.SupplyInfo;
import com.roncoo.recharge.common.entity.SupplyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SupplyInfoMapper {
    int countByExample(SupplyInfoExample example);

    int deleteByExample(SupplyInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SupplyInfo record);

    int insertSelective(SupplyInfo record);

    List<SupplyInfo> selectByExample(SupplyInfoExample example);

    SupplyInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SupplyInfo record, @Param("example") SupplyInfoExample example);

    int updateByExample(@Param("record") SupplyInfo record, @Param("example") SupplyInfoExample example);

    int updateByPrimaryKeySelective(SupplyInfo record);

    int updateByPrimaryKey(SupplyInfo record);
}
