package com.shivam.lovable_ai.entity;


import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "T_USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String email;

    private String passwordHash;
    private String name;
    private String avatarUrl;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    @OneToOne(mappedBy = "user")
    private Subscription subscription; // inverse side
}
