/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.AcctLog;
import com.roncoo.recharge.common.entity.AcctLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AcctLogMapper {
    int countByExample(AcctLogExample example);

    int deleteByExample(AcctLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcctLog record);

    int insertSelective(AcctLog record);

    List<AcctLog> selectByExample(AcctLogExample example);

    AcctLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcctLog record, @Param("example") AcctLogExample example);

    int updateByExample(@Param("record") AcctLog record, @Param("example") AcctLogExample example);

    int updateByPrimaryKeySelective(AcctLog record);

    int updateByPrimaryKey(AcctLog record);
}
