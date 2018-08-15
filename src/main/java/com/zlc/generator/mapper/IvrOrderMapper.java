package com.zlc.generator.mapper;

import com.zlc.generator.po.IvrOrder;
import com.zlc.generator.po.IvrOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IvrOrderMapper {
    int countByExample(IvrOrderExample example);

    int deleteByExample(IvrOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IvrOrder record);

    int insertSelective(IvrOrder record);

    List<IvrOrder> selectByExample(IvrOrderExample example);

    IvrOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IvrOrder record, @Param("example") IvrOrderExample example);

    int updateByExample(@Param("record") IvrOrder record, @Param("example") IvrOrderExample example);

    int updateByPrimaryKeySelective(IvrOrder record);

    int updateByPrimaryKey(IvrOrder record);
}