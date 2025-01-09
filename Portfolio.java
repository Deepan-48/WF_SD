package com.example.project.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalValue;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    // Constructor
    public Portfolio(double totalValue, Client client) {
        this.totalValue = totalValue;
        this.client = client;
    }

    public Portfolio() {}

    // Getters and Setters
    // Add for all variables except `id`.
}
