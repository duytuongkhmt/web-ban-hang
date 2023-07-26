package com.example.webbanhang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productsizes")
public class ProductSizes {
    @Id  @Column@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCoSi;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne @JoinColumn(name = "idsize")
    private Size size;
    @ManyToOne @JoinColumn(name = "idProductsColors")
    private ProductColors productColors;


}
