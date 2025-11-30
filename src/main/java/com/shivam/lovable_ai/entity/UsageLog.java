package com.shivam.lovable_ai.entity;

import jakarta.persistence.*;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.springframework.context.annotation.EnableMBeanExport;

import java.time.Instant;

@Entity
@Table(name = "T_USAGE_LOG")
public class UsageLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long userId;
    private Long projectId;
    private String action;
    private int tokensUsed;
    private int durationMs;
    private String metadata;
    private Instant createdAt;
}
