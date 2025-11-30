package com.shivam.lovable_ai.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "T_CHAT_SESSION")
public class ChatSession {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long projectId;

    private Long userId;
    private String title;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
}
