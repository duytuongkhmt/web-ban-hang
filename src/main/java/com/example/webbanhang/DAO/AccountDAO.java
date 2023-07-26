package com.example.webbanhang.DAO;



import com.example.webbanhang.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends JpaRepository<Account,String> {
}
