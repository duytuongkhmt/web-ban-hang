package com.example.webbanhang.controller;

import com.example.webbanhang.DTO.OrderDetailDTO;
import com.example.webbanhang.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
public class OrderController {

    private final OrderDetailService orderDetailService;

    @GetMapping("user/orderdetails")
    public ResponseEntity<List<OrderDetailDTO>> allOrderOfUser(){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return ResponseEntity.ok(orderDetailService.findAllByUsername(username)) ;
    }

}
