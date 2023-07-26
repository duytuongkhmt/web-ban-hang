package com.example.webbanhang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {
    @Id @Column(length = 100)
    private String idUsername;
    @Column(nullable = false,length = 100)
    private String password;
    @Column(nullable = false,columnDefinition = "nvarchar(60)")
    private String fullname;
    @Column(nullable = false, length = 50)
    private String email;
    @Column(length = 50)
    private String photo;
    @Column(length = 50)
    private String phoneNumber;
    @Column(name="createdby")
    @CreatedBy
    private String createdBy;
    @Column(name="createddate")
    @CreatedDate
    private Date createdDate;
    @Column(name="modifiedby")
    @LastModifiedBy
    private String modifiedBy;
    @Column(name="modifieddate")
    @LastModifiedDate
    private Date modifiedDate;

    @OneToMany(mappedBy = "account" , fetch = FetchType.EAGER)
    List<Authorities> authorities;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    List<Comment> comments;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    List<Favorite> favorites;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    List<Orders> orders;
}
