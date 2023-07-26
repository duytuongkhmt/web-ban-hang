package com.example.webbanhang.DAO;
import com.example.webbanhang.entity.ProductStyle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductStyleDAO extends JpaRepository<ProductStyle,Integer> {
    @Query("select  o from ProductStyle o where o.categoryType.idCategory=?1")
    List<ProductStyle> findAllByIdCategory(Integer idCategory);




}
