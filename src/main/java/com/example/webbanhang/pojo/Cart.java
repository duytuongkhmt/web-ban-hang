package com.example.webbanhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart {
    private Integer idProduct;
    private String nameProduct;
    private double priceProduct;
    private String photoColor;
    private int quantity;
    private Integer idColor;
    private String nameColor;
    private Integer idSize;
    private String nameSize;
    private Integer idProductsColors;
    private double amount;
}
