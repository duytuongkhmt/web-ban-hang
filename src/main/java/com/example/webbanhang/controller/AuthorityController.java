package com.example.webbanhang.controller;

import com.example.webbanhang.DTO.AuthoritiesDTO;
import com.example.webbanhang.service.AuthoritiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class AuthorityController {
    private final AuthoritiesService authoritiesService;
    
    @PostMapping("admin/authority")
    public ResponseEntity<AuthoritiesDTO> newAuthority(@RequestBody AuthoritiesDTO authoritiesDTO){

        return ResponseEntity.ok(authoritiesService.create(authoritiesDTO));
    }
    @GetMapping("/admin/authority")
    public String gettt(){
        return "Hello";
    }

}
