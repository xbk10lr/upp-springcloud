package com.upp.dao.mapper;

import com.upp.dto.generate.Channelrout;
import com.upp.dto.generate.ChannelroutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelroutMapper {
    long countByExample(ChannelroutExample example);

    int deleteByExample(ChannelroutExample example);

    int deleteByPrimaryKey(String id);

    int insert(Channelrout record);

    int insertSelective(Channelrout record);

    List<Channelrout> selectByExample(ChannelroutExample example);

    Channelrout selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Channelrout record, @Param("example") ChannelroutExample example);

    int updateByExample(@Param("record") Channelrout record, @Param("example") ChannelroutExample example);

    int updateByPrimaryKeySelective(Channelrout record);

    int updateByPrimaryKey(Channelrout record);
}