/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.AcctInfo;
import com.roncoo.recharge.common.entity.AcctInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AcctInfoMapper {
    int countByExample(AcctInfoExample example);

    int deleteByExample(AcctInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcctInfo record);

    int insertSelective(AcctInfo record);

    List<AcctInfo> selectByExample(AcctInfoExample example);

    AcctInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcctInfo record, @Param("example") AcctInfoExample example);

    int updateByExample(@Param("record") AcctInfo record, @Param("example") AcctInfoExample example);

    int updateByPrimaryKeySelective(AcctInfo record);

    int updateByPrimaryKey(AcctInfo record);
}
