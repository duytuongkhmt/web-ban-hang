package com.example.webbanhang.serviceImpl;
import com.example.webbanhang.DAO.ProductStyleDAO;
import com.example.webbanhang.DTO.ProductStyleDTO;
import com.example.webbanhang.convert.Convert;
import com.example.webbanhang.entity.ProductStyle;
import com.example.webbanhang.service.ProductStyleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductStyleServiceImpl implements ProductStyleService {

    private final ProductStyleDAO productStyleDAO;


    private final Convert convert;

    @Override
    public List<ProductStyleDTO> findAll() {
       List<ProductStyle> productStyle = productStyleDAO.findAll();
       List<ProductStyleDTO> productStyleDTOS = productStyle.stream()
               .map(productStyles -> convert.toDto(productStyles,ProductStyleDTO.class))
               .collect(Collectors.toList());
        return productStyleDTOS;
    }

    @Override
    public ProductStyleDTO findById(Integer id) {
        return null;
    }

    @Override @Transactional(rollbackFor = {Exception.class, Throwable.class})
    public ProductStyleDTO create(ProductStyleDTO productStyleDto) {
        return null;
    }

    @Override @Transactional(rollbackFor = {Exception.class, Throwable.class})
    public ProductStyleDTO update(ProductStyleDTO productStyleDto) {
        return null;
    }

    @Override @Transactional(rollbackFor = {Exception.class, Throwable.class})
    public void remove(Integer id) {

    }

    @Override
    public List<ProductStyleDTO> findAllByIdCategory(Integer idCategory) {
        List<ProductStyle> productStyle = productStyleDAO.findAllByIdCategory(idCategory);
        List<ProductStyleDTO> productStyleDTOS = productStyle.stream()
                .map(productStyles -> convert.toDto(productStyles,ProductStyleDTO.class))
                .collect(Collectors.toList());
        return productStyleDTOS;
    }
}
