package com.shivam.lovable_ai.entity;

import jakarta.persistence.*;
import lombok.extern.java.Log;

import java.time.Instant;

@Entity
@Table(name = "T_CHAT_MESSAGE")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long projectId;
    private Long userId;
    private String role;
    private String content;
    private String toolCalls;
    private String toolCallId;
    private int tokensUsed;
    private Instant createdAt;
}
