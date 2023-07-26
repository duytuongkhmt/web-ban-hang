package com.example.webbanhang.service;



import com.example.webbanhang.DTO.RoleDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> findAll();
    RoleDTO findById(Integer id);
    void create(RoleDTO RoleDto);
    void update(RoleDTO RoleDto);
    void remove(Integer id);
}
