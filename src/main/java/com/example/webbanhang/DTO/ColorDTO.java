package com.example.webbanhang.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Data
@NoArgsConstructor
public class ColorDTO implements Serializable {
    private Integer idColor;
    @NotBlank(message = "${NotBlank.ColorDTO.nameColor}")
    private String nameColor;
}
