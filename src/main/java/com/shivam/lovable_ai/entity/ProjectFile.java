package com.shivam.lovable_ai.entity;


import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "T_PROJECT_FILE")
public class ProjectFile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    @JoinColumn(name = "project_id")
    private Project project;
    @Column(unique = true)
    private String path;
    private String minioObjectKey;
    private Long createdBy;
    private Long updatedBy;
    private Instant createdAt;
    private Instant updatedAt;
}
