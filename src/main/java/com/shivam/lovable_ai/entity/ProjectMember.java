package com.shivam.lovable_ai.entity;


import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "T_PROJECT_MEMBER")
public class ProjectMember {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long projectId;

    private Long userId;
    private String role;
    private Long invitedBy;
    private Instant invitedAt;
}
