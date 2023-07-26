package com.example.webbanhang.service;


import com.example.webbanhang.DTO.CommentDTO;

import java.util.List;

public interface CommentService {
    List<CommentDTO> findAll();
    CommentDTO findById(Integer id);
    CommentDTO create(CommentDTO CommentDto);
    void update(CommentDTO CommentDto);
    void remove(Integer id);

    List<CommentDTO> findAllByIdProduct(Integer id);
}
