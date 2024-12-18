package com.itheima.domain;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Problem implements Serializable {
    private Integer problemId;      // 主键 ID
    private Integer problemUid;     // 反馈人 ID
    private String problemTitle;    // 问题标题
    private String problemPage;     // 所在页面
    private String problemContent;  // 问题内容
    private String problemLink;     // 联系方式
    private String problemStatus;   // 状态（0：未解决，1：已解决）
    private LocalDateTime problemTime; // 反馈时间

    // Getters and Setters
    public Integer getProblemId() {
        return problemId;
    }
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }
    public Integer getProblemUid() {
        return problemUid;
    }
    public void setProblemUid(Integer problemUid) {
        this.problemUid = problemUid;
    }
    public String getProblemTitle() {
        return problemTitle;
    }
    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }
    public String getProblemPage() {
        return problemPage;
    }
    public void setProblemPage(String problemPage) {
        this.problemPage = problemPage;
    }
    public String getProblemContent() {
        return problemContent;
    }
    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent;
    }
    public String getProblemLink() {
        return problemLink;
    }
    public void setProblemLink(String problemLink) {
        this.problemLink = problemLink;
    }
    public String getProblemStatus() {
        return problemStatus;
    }
    public void setProblemStatus(String problemStatus) {
        this.problemStatus = problemStatus;
    }
    public LocalDateTime getProblemTime() {
        return problemTime;
    }
    public void setProblemTime(LocalDateTime problemTime) {
        this.problemTime = problemTime;
    }
}