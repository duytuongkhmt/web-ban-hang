package com.example.webbanhang.controller;
import com.example.webbanhang.DTO.ProductSizesDTO;
import com.example.webbanhang.DTO.SizeDTO;
import com.example.webbanhang.service.ProductSizesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import jakarta.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ProductSizesController {

   private final ProductSizesService productSizesService;

    @PostMapping("admin/productsizes")
    public ResponseEntity<ProductSizesDTO> addNewProductSize(@Valid @RequestBody ProductSizesDTO productSizesDTO){
       return ResponseEntity.status(HttpStatus.CREATED).body(productSizesService.create(productSizesDTO));
    }
    @PutMapping("admin/productsizes")
    public ResponseEntity<ProductSizesDTO> updateProductSize(@Valid @RequestBody ProductSizesDTO productSizesDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(productSizesService.create(productSizesDTO));
    }

    @DeleteMapping("admin/productsize/{idProductSize}")
    public ResponseEntity deleteProductSize(@PathVariable Integer idProductSize){
        productSizesService.remove(idProductSize);
        return ResponseEntity.ok().build();
    }

    @GetMapping("user/size/{idProductColor}")
    public ResponseEntity<List<SizeDTO>>  getSizesByIdProduct(@PathVariable Integer idProductColor){
        return ResponseEntity.ok(productSizesService.findByIdProductColor(idProductColor));
    }

}
