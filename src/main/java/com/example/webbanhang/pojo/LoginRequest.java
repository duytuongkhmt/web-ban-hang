package com.example.webbanhang.pojo;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    @NotBlank(message = "{NotBlank.LoginRequest.username}")
    String username;
    @NotBlank(message = "{NotBlank.LoginRequest.password}")
    String password;
}
