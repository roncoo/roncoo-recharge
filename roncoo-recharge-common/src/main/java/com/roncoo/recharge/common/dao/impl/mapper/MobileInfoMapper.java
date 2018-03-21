/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.MobileInfo;
import com.roncoo.recharge.common.entity.MobileInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MobileInfoMapper {
    int countByExample(MobileInfoExample example);

    int deleteByExample(MobileInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MobileInfo record);

    int insertSelective(MobileInfo record);

    List<MobileInfo> selectByExample(MobileInfoExample example);

    MobileInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MobileInfo record, @Param("example") MobileInfoExample example);

    int updateByExample(@Param("record") MobileInfo record, @Param("example") MobileInfoExample example);

    int updateByPrimaryKeySelective(MobileInfo record);

    int updateByPrimaryKey(MobileInfo record);
}
