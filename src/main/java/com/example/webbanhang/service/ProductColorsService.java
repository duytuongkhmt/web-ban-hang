package com.example.webbanhang.service;


import com.example.webbanhang.DTO.ColorDTO;
import com.example.webbanhang.DTO.ProductColorsDTO;

import java.util.List;
import java.util.Map;

public interface ProductColorsService {
    Map<String,Object> findAll(int page, int size);
    ProductColorsDTO findById(Integer id);

    ProductColorsDTO findByIdColorAndIdProduct(Integer idColor, Integer idProduct);

    ProductColorsDTO create(ProductColorsDTO ProductColorsDto);
    ProductColorsDTO update(ProductColorsDTO ProductColorsDto);
    void remove(Integer id);

    List<ColorDTO> findByIdProduct(Integer idProduct);

    Map<String,Object> findByColor(Integer idColor,int page,int size);

    Map<String,Object> fillBySize(Integer idSize,int page,int size);
}
