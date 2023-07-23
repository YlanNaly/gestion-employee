package com.prog4.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private String slogan;
    @Column(unique = true)
    private String address;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    private String logo;

    @OneToOne
    private Fiscal idFiscal;
}
