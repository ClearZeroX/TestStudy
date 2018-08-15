package com.channelsoft.zlc.generator.mapper;

import com.channelsoft.zlc.po.ZnkfZdwh;
import com.channelsoft.zlc.po.ZnkfZdwhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZnkfZdwhMapper {
    int countByExample(ZnkfZdwhExample example);

    int deleteByExample(ZnkfZdwhExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZnkfZdwh record);

    int insertSelective(ZnkfZdwh record);

    List<ZnkfZdwh> selectByExample(ZnkfZdwhExample example);

    ZnkfZdwh selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZnkfZdwh record, @Param("example") ZnkfZdwhExample example);

    int updateByExample(@Param("record") ZnkfZdwh record, @Param("example") ZnkfZdwhExample example);

    int updateByPrimaryKeySelective(ZnkfZdwh record);

    int updateByPrimaryKey(ZnkfZdwh record);
}