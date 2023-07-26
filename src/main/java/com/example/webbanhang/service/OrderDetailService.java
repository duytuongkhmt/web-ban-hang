package com.example.webbanhang.service;



import com.example.webbanhang.DTO.OrderDetailDTO;
import com.example.webbanhang.entity.ReportBestSellingProduct;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetailDTO> findAll();
    OrderDetailDTO findById(Integer id);
    OrderDetailDTO create(OrderDetailDTO OrderDetailDto);

    List<OrderDetailDTO> createAll(List<OrderDetailDTO> orderDetailDTO);

    List<OrderDetailDTO> findAllByUsername(String username);

    List<ReportBestSellingProduct> reportBestSellingProducts(Integer fromYear, Integer toYear, Integer month);

    void update(OrderDetailDTO OrderDetailDto);
    void remove(Integer id);
}
