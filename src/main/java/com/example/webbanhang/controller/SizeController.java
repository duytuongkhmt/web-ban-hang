package com.example.webbanhang.controller;
import com.example.webbanhang.DTO.SizeDTO;
import com.example.webbanhang.service.SizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SizeController {

    private final SizeService sizeService;

    @GetMapping("user/sizes")
    public ResponseEntity<List<SizeDTO>> getAll(){
        return ResponseEntity.ok(sizeService.findAll());
    }

    @PostMapping("admin/sizes")
    public ResponseEntity<SizeDTO> createSize(@Valid @RequestBody SizeDTO size){
        return ResponseEntity.ok(sizeService.create(size));
    }

    @PutMapping("admin/sizes")
    public ResponseEntity<SizeDTO> updateSize(@Valid @RequestBody SizeDTO size){
        return ResponseEntity.ok(sizeService.update(size));
    }

    @DeleteMapping("admin/sizes")
    public ResponseEntity removeSize(@RequestBody List<Integer> id){
        sizeService.remove(id);
        return ResponseEntity.ok().build();
    }
}
