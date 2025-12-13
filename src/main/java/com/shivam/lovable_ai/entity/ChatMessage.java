package com.shivam.lovable_ai.entity;

import jakarta.persistence.*;
import lombok.extern.java.Log;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_CHAT_MESSAGE")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToMany
    private final List<UserEntity> user = new ArrayList<>();
    private String role;
    private String content;
    private String toolCalls;
    private String toolCallId;
    private int tokensUsed;
    private Instant createdAt;
}
