package com.caseassit.Issues.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String title;
    private String description;
    @Column(name = "category")
    private String issueCategory;
    private AgeCat ageCategory;

    public enum AgeCat{
        Major , Minor
    }


}
