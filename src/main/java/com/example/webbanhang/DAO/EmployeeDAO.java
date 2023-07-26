package com.example.webbanhang.DAO;;

import com.example.webbanhang.entity.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository<Authorities,Integer> {
}
