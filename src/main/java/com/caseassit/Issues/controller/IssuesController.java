package com.caseassit.Issues.controller;

import com.caseassit.Issues.model.Issue;
import com.caseassit.Issues.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5501")
@RestController
public class IssuesController {
    @Autowired
    private IssueService service;

    @GetMapping("/AllIssues")
    public List<Issue> getIssues(){
        return service.getAllIssue();
    }

    @PostMapping("/newIssue")
    public void addNewIssue(@RequestBody Issue issues){
        service.addIssue(issues);
    }



}
