/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.SysLogLogin;
import com.roncoo.recharge.common.entity.SysLogLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysLogLoginMapper {
    int countByExample(SysLogLoginExample example);

    int deleteByExample(SysLogLoginExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysLogLogin record);

    int insertSelective(SysLogLogin record);

    List<SysLogLogin> selectByExample(SysLogLoginExample example);

    SysLogLogin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysLogLogin record, @Param("example") SysLogLoginExample example);

    int updateByExample(@Param("record") SysLogLogin record, @Param("example") SysLogLoginExample example);

    int updateByPrimaryKeySelective(SysLogLogin record);

    int updateByPrimaryKey(SysLogLogin record);
}
