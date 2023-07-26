package com.example.webbanhang.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class OrderDetailDTO implements Serializable {
    private int quantity;
    private double amount;
    private String colorName;
    private String sizeName;
    private Integer idProduct;
    private String nameProduct;
    private Integer ordersId;
}
