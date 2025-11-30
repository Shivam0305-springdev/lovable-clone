package com.shivam.lovable_ai.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "T_PROJECT")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private Long ownerId;
    private boolean isPublic;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
}
