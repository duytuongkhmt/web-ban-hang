package com.example.webbanhang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "favorite")
@EntityListeners(AuditingEntityListener.class)
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFavorite;
    @Column(nullable = false)
    @CreatedDate
    @LastModifiedDate
    private Date likeDate;

    @ManyToOne @JoinColumn(name = "idproduct")
    private Product product;
    @ManyToOne @JoinColumn(name = "idUsername")
    private Account account;

}
