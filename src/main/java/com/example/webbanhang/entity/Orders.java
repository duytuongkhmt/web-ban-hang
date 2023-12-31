package com.example.webbanhang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
@EntityListeners(AuditingEntityListener.class)
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrder;
    @Column(nullable = false)
    @CreatedDate
    private Date createDate;
    @Column(nullable = false,columnDefinition = "nvarchar(100)")
    private String address;

    @ManyToOne @JoinColumn(name = "username")
    private Account account;

    @OneToMany(mappedBy = "orders",fetch = FetchType.LAZY)
    List<OrderDetail> orderDetails;
}
