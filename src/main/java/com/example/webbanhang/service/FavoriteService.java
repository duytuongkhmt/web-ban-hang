package com.example.webbanhang.service;



import com.example.webbanhang.DTO.FavoriteDTO;

import java.util.List;

public interface FavoriteService {
    List<FavoriteDTO> findAll();
    FavoriteDTO findById(Integer id);
    FavoriteDTO create(FavoriteDTO FavoriteDto);
    void update(FavoriteDTO FavoriteDto);
    void remove(Integer id);
    Integer checkExistsFavorite(String idUsername, Integer idProduct);
}
