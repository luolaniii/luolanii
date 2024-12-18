package com.itheima.service.impl;
import com.itheima.domain.Problem;
import com.itheima.mapper.ProblemMapper;
import com.itheima.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {

    private final ProblemMapper problemMapper;

    @Autowired
    public ProblemServiceImpl(ProblemMapper problemMapper) {
        this.problemMapper = problemMapper;
    }

    @Override
    public List<Problem> getAllProblems() {
        return problemMapper.selectAllProblems();
    }

    @Override
    public Problem getProblemById(Integer id) {
        return problemMapper.getProblemById(id);
    }

    @Override
    public List<Problem> searchProblems(Problem problem) {
        return problemMapper.searchProblems(problem);
    }

    @Override
    public Integer addProblem(Problem problem) {
        return problemMapper.addProblem(problem);
    }

    @Override
    public Integer editProblem(Problem problem) {
        return problemMapper.editProblem(problem);
    }
}