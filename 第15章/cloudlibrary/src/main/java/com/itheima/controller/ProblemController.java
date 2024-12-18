package com.itheima.controller;

import com.itheima.domain.Problem;
import com.itheima.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problem")
public class ProblemController {

    private final ProblemService problemService;

    @Autowired
    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping("/all")
    public List<Problem> getAllProblems() {
        return problemService.getAllProblems();
    }

    @GetMapping("/{id}")
    public Problem getProblemById(@PathVariable Integer id) {
        return problemService.getProblemById(id);
    }

    @PostMapping("/search")
    public List<Problem> searchProblems(@RequestBody Problem problem) {
        return problemService.searchProblems(problem);
    }

    @PostMapping("/add")
    public Integer addProblem(@RequestBody Problem problem) {
        return problemService.addProblem(problem);
    }

    @PutMapping("/edit")
    public Integer editProblem(@RequestBody Problem problem) {
        return problemService.editProblem(problem);
    }
}