package com.example.webbanhang.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class ProductSizesDTO implements Serializable {
    @NotNull(message = "{NotNull.ProductSizesDTO.idSize}")
    private Integer idSize;
    private int quantity;
    private ColorDTO colorProduct;
    private ProductDTO product;
}
