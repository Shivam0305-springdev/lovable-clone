package com.shivam.lovable_ai.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "T_SUBSCRIPTION")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String stripeSubscriptionId;
    private String status;
    private Instant currentPeriodStart;
    private Instant currentPeriodEnd;
    private boolean cancelAtPeriodEnd;
    private Instant createdAt;
    private Instant updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user; // owning side

    @OneToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;

}
