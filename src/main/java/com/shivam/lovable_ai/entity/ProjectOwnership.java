package com.shivam.lovable_ai.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_PROJECT_OWNERSHIP")
public class ProjectOwnership {

    @Id
    private Long projectId;

    private Long userId;
}
