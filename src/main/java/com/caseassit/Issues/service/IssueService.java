package com.caseassit.Issues.service;

import com.caseassit.Issues.model.Issue;
import com.caseassit.Issues.repository.IssuesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {
    @Autowired
    private IssuesRepo repo;

    public List<Issue> getAllIssue() {
        return repo.findAll();
    }
    public void addIssue(Issue issues){
        // TODO:Add a validator
        repo.save(issues);
    }
}
