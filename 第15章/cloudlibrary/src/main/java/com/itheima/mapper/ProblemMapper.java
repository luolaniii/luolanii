package com.itheima.mapper;

import com.itheima.domain.Problem;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProblemMapper {

    @Select("SELECT * FROM problem ORDER BY problem_time DESC")
    @Results(id = "problemMap", value = {
            @Result(id = true, column = "problem_id", property = "problemId"),
            @Result(column = "problem_uid", property = "problemUid"),
            @Result(column = "problem_title", property = "problemTitle"),
            @Result(column = "problem_page", property = "problemPage"),
            @Result(column = "problem_content", property = "problemContent"),
            @Result(column = "problem_link", property = "problemLink"),
            @Result(column = "problem_status", property = "problemStatus"),
            @Result(column = "problem_time", property = "problemTime")
    })
    List<Problem> selectAllProblems();

    @Select("SELECT * FROM problem WHERE problem_id = #{id}")
    @ResultMap("problemMap")
        // 根据 ID 查询问题
    Problem getProblemById(Integer id);

    @Select({"<script>",
            "SELECT * FROM problem",
            "WHERE 1=1",
            "<if test=\"problemTitle != null\"> AND problem_title LIKE CONCAT('%', #{problemTitle}, '%')</if>",
            "<if test=\"problemPage != null\"> AND problem_page LIKE CONCAT('%', #{problemPage}, '%')</if>",
            "<if test=\"problemStatus != null\"> AND problem_status = #{problemStatus}</if>",
            "ORDER BY problem_time DESC",
            "</script>"
    })
    @ResultMap("problemMap")
        // 条件查询问题（可分页）
    List<Problem> searchProblems(Problem problem);

    @Insert("INSERT INTO problem (problem_uid, problem_title, problem_page, problem_content, problem_link, problem_status, problem_time) " +
            "VALUES (#{problemUid}, #{problemTitle}, #{problemPage}, #{problemContent}, #{problemLink}, #{problemStatus}, #{problemTime})")
        // 新增问题
    Integer addProblem(Problem problem);

    @Update({"<script>",
            "UPDATE problem",
            "<set>",
            "<if test=\"problemUid != null\">problem_uid = #{problemUid},</if>",
            "<if test=\"problemTitle != null\">problem_title = #{problemTitle},</if>",
            "<if test=\"problemPage != null\">problem_page = #{problemPage},</if>",
            "<if test=\"problemContent != null\">problem_content = #{problemContent},</if>",
            "<if test=\"problemLink != null\">problem_link = #{problemLink},</if>",
            "<if test=\"problemStatus != null\">problem_status = #{problemStatus},</if>",
            "<if test=\"problemTime != null\">problem_time = #{problemTime}</if>",
            "</set>",
            "WHERE problem_id = #{problemId}",
            "</script>"
    })
        // 编辑问题
    Integer editProblem(Problem problem);
}