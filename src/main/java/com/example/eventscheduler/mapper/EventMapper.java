package com.example.eventscheduler.mapper;

import com.example.eventscheduler.annotations.ReadOnly;
import com.example.eventscheduler.models.Event;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@ReadOnly

public interface EventMapper {

    String deleteById = "delete * from events where id = #{id, jdbcType=BIGINT}";
    String getEventById = "select * from events where id = #{id,jdbcType=BIGINT}";
    String getAllEventByDate = "select * from events where startAt >= now()";
    @Select({getEventById})
    @Results({@Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "created_at", property = "createdAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "updated_at", property = "updatedAt", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "location", property = "location", jdbcType = JdbcType.VARCHAR),
            @Result(column = "startAt", property = "contestId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "endAt", property = "teamId", jdbcType = JdbcType.VARCHAR)})
    Event selectByPrimaryKey(Long id);

    @Delete(deleteById)
    void deleteEventById(Long id);

    @Select(getAllEventByDate)
    List<Event> getAllEvents();


}
