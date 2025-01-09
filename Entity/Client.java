package com.example.project.entities;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    // Constructor
    public Client(String name, String email, String phone, FinancialAdvisor advisor) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
    }

    public Client() {}

    // Getters and Setters
    // Add for all variables except `id`.
}
