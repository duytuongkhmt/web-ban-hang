package com.example.webbanhang.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SizeDTO implements Serializable {
    private Integer idSize;

    @NotBlank(message = "${NotBlank.RoleDTO.nameRole}")
    private String nameSize;
}
