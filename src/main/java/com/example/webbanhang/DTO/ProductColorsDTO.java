package com.example.webbanhang.DTO;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;


@Data
@NoArgsConstructor
public class ProductColorsDTO implements Serializable {
    @NotNull(message = "{NotNull.ProductColorsDTO.idColor}")
    private Integer idColor;
    private String nameColor;
    @NotBlank(message = "{NotBlank.ProductColorsDTO.photoColor}")
    private String photoColor;
    @NotNull(message = "{NotNull.ProductColorsDTO.idProduct}")
    private Integer idProduct;
    @NotBlank(message = "{NotBlank.ProductDTO.nameProduct}")
    private String nameProduct;
    @Min(value = 1, message = "{Min.ProductDTO.price}")
    private double priceProduct;
    private Integer idProductsColors;
    private String descriptionProduct;
}
