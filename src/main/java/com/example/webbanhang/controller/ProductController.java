package com.example.webbanhang.controller;


import com.example.webbanhang.DTO.ProductDTO;
import com.example.webbanhang.service.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@Validated
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    //lấy toàn bộ sản phẩm trong db và phân trang
    @GetMapping("user/products")
    public ResponseEntity<Map<String,Object>> getAllProducts(@RequestParam Optional<Integer> pageNum,
                                                             @RequestParam Optional<Integer> size) {
        return ResponseEntity.ok(productService.findAll(pageNum.orElse(0), size.orElse(10)));
    }


    @GetMapping("user/products/{nameProduct}")
    public ResponseEntity<List<ProductDTO>> getAllProductByName(@PathVariable String nameProduct) {
        return ResponseEntity.ok(productService.findAllByNameProduct(nameProduct));
    }


//    @GetMapping("user/products/all/{page}/{size}")
//    public List<ProductDTO> paging(@PathVariable("page") Optional<Integer> page, @PathVariable("size") Optional<Integer> size ) {
//        return productService.page(size.orElseThrow(() -> {throw new RuntimeException("page isn't error!");}),page.orElseThrow(() ->{throw new RuntimeException("page isn't error!");}));
//    }

    //tìm sản phẩm theo khoảng giá
//    @GetMapping("user/products/price/{min}/{max}")
//    public ResponseEntity<List<ProductDTO>> getProductByMinMaxPrice(@PathVariable("min") Optional<Double> min,@PathVariable("max") Optional<Double> max ){
//    	double mi = min.orElse(0.0);
//    	double ma = max.orElse(productService.findAll().stream().mapToDouble(p -> p.getPrice()).max().getAsDouble());
//    	List<ProductDTO> list = productService.findAll().stream().filter(t -> (t.getPrice()>=mi && t.getPrice()<=ma)).collect(Collectors.toList());
//    	return ResponseEntity.ok(list);
//    }

    //fill sản phẩm theo danh mục
    @GetMapping("user/products/bycategory/{idCategory}")
    public ResponseEntity<List<ProductDTO>> showByIdCategory(@PathVariable Integer idCategory) {
        return ResponseEntity.ok(productService.findAllByIdCategory(idCategory));
    }

    //tìm sản phẩm theo id
    @GetMapping("user/products/{id}")
    public ProductDTO getProductById(@PathVariable("id") Integer id) {
        return productService.findById(id);
    }

    //cập nhật sản phẩm
    @PutMapping("/admin/products")
    public ProductDTO updateProduct(@RequestBody ProductDTO product) {
        return productService.update(product);
    }

    //fill sản phẩm theo style
    @GetMapping("user/products/bystyle/{idStyle}/{idCategory}")
    public ResponseEntity<List<ProductDTO>> getAllProductByStyle(@PathVariable Integer idStyle,
                                                                 @PathVariable Integer idCategory) {
        return ResponseEntity.ok(productService.fillByIdCategoryAndIdStyle(idCategory, idStyle));
    }

    //thêm mới sản phẩm
    @PostMapping("/admin/products")
    public ResponseEntity<ProductDTO> addNewProduct(@Valid @RequestBody ProductDTO productDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(productDTO));
    }


    @DeleteMapping("/admin/products")
    public void deleteProduct(@RequestParam @NotNull(message = "Vui lòng chọn ít nhất 1 sản phẩm để xóa")
                                  List<Integer> idProduct){
        productService.remove(idProduct);
    }
    
}

