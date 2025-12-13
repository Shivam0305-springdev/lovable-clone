package com.shivam.lovable_ai.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "T_PLAN")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String stripePriceId;
    private int maxProject;
    private int maxTokenPerDay;
    private int maxPreviews;
    private boolean unlimitedAi;
    private String features;
    private boolean active;

    @OneToOne(mappedBy = "plan")
    private Subscription subscription;
}
