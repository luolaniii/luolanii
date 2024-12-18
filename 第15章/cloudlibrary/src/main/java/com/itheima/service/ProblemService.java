package com.itheima.service;
import com.itheima.domain.Problem;
import java.util.List;

public interface ProblemService {

    // 查询所有问题
    List<Problem> getAllProblems();

    // 根据 ID 查询问题
    Problem getProblemById(Integer id);

    // 条件查询问题（可分页）
    List<Problem> searchProblems(Problem problem);

    // 新增问题
    Integer addProblem(Problem problem);

    // 编辑问题
    Integer editProblem(Problem problem);
}