/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.SysPlatform;
import com.roncoo.recharge.common.entity.SysPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysPlatformMapper {
    int countByExample(SysPlatformExample example);

    int deleteByExample(SysPlatformExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPlatform record);

    int insertSelective(SysPlatform record);

    List<SysPlatform> selectByExample(SysPlatformExample example);

    SysPlatform selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPlatform record, @Param("example") SysPlatformExample example);

    int updateByExample(@Param("record") SysPlatform record, @Param("example") SysPlatformExample example);

    int updateByPrimaryKeySelective(SysPlatform record);

    int updateByPrimaryKey(SysPlatform record);
}
