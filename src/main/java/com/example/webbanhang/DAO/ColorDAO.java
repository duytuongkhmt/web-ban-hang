package com.example.webbanhang.DAO;

import com.example.webbanhang.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorDAO extends JpaRepository<Color,Integer> {
}
