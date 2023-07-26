package com.example.webbanhang.serviceImpl;
import com.example.webbanhang.convert.Convert;

import com.example.webbanhang.DAO.OrdersDAO;
import com.example.webbanhang.DTO.OrdersDTO;

import com.example.webbanhang.entity.Orders;
import com.example.webbanhang.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrdersServiceImpl implements OrdersService {

    private final OrdersDAO ordersDAO;
    private final Convert convert;
    @Override
    public List<OrdersDTO> findAll() {
        return null;
    }

    @Override
    public OrdersDTO findById(Integer id) {
        return null;
    }

    @Override
    public OrdersDTO create(OrdersDTO OrdersDto) {
        Orders orders = convert.toEntity(OrdersDto, Orders.class);
        OrdersDTO ordersDTO = convert.toDto(ordersDAO.save(orders),OrdersDTO.class);
        return ordersDTO;
    }

    @Override
    public void update(OrdersDTO OrdersDto) {

    }

    @Override
    public void remove(Integer id) {

    }
}
