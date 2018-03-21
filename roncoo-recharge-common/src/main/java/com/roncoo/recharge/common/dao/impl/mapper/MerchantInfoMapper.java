/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.dao.impl.mapper;

import com.roncoo.recharge.common.entity.MerchantInfo;
import com.roncoo.recharge.common.entity.MerchantInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MerchantInfoMapper {
    int countByExample(MerchantInfoExample example);

    int deleteByExample(MerchantInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MerchantInfo record);

    int insertSelective(MerchantInfo record);

    List<MerchantInfo> selectByExample(MerchantInfoExample example);

    MerchantInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MerchantInfo record, @Param("example") MerchantInfoExample example);

    int updateByExample(@Param("record") MerchantInfo record, @Param("example") MerchantInfoExample example);

    int updateByPrimaryKeySelective(MerchantInfo record);

    int updateByPrimaryKey(MerchantInfo record);
}
