package com.shivam.lovable_ai.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "T_PREVIEW")
public class Preview {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long projectId;
    private String namespace;
    private String podName;
    private String previewUrl;
    private String status;
    private Instant createdAt;
    private Instant startedAt;
    private Instant terminatedAt;
}
