package com.example.webbanhang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ReportBestSellingProduct implements Serializable {
    @Id
    private Integer idProduct;
    private String nameProduct;
    private Long count;
    private Double amount;
    private double price;
}
