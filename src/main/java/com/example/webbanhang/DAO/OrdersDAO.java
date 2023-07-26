package com.example.webbanhang.DAO;
import com.example.webbanhang.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersDAO extends JpaRepository<Orders,Integer> {



}
