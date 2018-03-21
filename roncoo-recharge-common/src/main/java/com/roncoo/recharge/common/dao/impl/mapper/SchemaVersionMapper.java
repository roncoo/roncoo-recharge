/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.roncoo.recharge.common.entity.SchemaVersion;
import com.roncoo.recharge.common.entity.SchemaVersionExample;

@Mapper
public interface SchemaVersionMapper {
    int countByExample(SchemaVersionExample example);

    int deleteByExample(SchemaVersionExample example);

    int deleteByPrimaryKey(String version);

    int insert(SchemaVersion record);

    int insertSelective(SchemaVersion record);

    List<SchemaVersion> selectByExample(SchemaVersionExample example);

    SchemaVersion selectByPrimaryKey(String version);

    int updateByExampleSelective(@Param("record") SchemaVersion record, @Param("example") SchemaVersionExample example);

    int updateByExample(@Param("record") SchemaVersion record, @Param("example") SchemaVersionExample example);

    int updateByPrimaryKeySelective(SchemaVersion record);

    int updateByPrimaryKey(SchemaVersion record);
}
