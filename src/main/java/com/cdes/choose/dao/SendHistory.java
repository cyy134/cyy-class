package com.cdes.choose.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SendHistory {

    @Select("select * from sendhistory")
    List<SendHistory> getSendHistory();

    @Select("select * from sendhistory where id = #{id}")
    SendHistory getOneSendHistory(int id);

    @Delete("delete ")
    void delectSendHistoryById(int id);
}
