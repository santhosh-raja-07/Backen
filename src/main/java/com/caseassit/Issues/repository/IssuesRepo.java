package com.caseassit.Issues.repository;


import com.caseassit.Issues.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuesRepo extends JpaRepository<Issue, Integer> {

}
