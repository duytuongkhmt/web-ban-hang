package com.example.webbanhang.service;



import com.example.webbanhang.DTO.AuthoritiesDTO;

import java.util.List;

public interface AuthoritiesService {
    List<AuthoritiesDTO> findAll();
    AuthoritiesDTO findById(Integer id);
    AuthoritiesDTO create(AuthoritiesDTO AuthoritiesDTO);
    AuthoritiesDTO update(AuthoritiesDTO AuthoritiesDTO);
    void remove(List<Integer> id);
}
