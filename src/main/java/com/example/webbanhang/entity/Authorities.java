package com.example.webbanhang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "authorities")
public class Authorities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthorities;
    @ManyToOne @JoinColumn(name ="idUsername")
    private Account account;
    @ManyToOne @JoinColumn(name ="idRole")
    private Role role;

}
