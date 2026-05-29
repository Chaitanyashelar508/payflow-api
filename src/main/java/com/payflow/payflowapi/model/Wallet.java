package com.payflow.payflowapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "wallets")
@Data
@NoArgsConstructor
public class Wallet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne @JoinColumn(name = "user_id")
    private  User user;

    @Column(nullable = false)
    private BigDecimal balance;

    private LocalDateTime date;
}
