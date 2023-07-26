package com.example.webbanhang.controller;
import com.example.webbanhang.DTO.ProductStyleDTO;
import com.example.webbanhang.service.ProductStyleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ProductStyleController {


    private final ProductStyleService productStyleService;

    @GetMapping("user/productstyle/show/{idCategory}")
    public ResponseEntity<List<ProductStyleDTO>> showAll(@PathVariable Integer idCategory){
      return  ResponseEntity.ok(productStyleService.findAllByIdCategory(idCategory));
    }


}
