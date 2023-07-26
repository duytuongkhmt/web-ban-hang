package com.example.webbanhang.DAO;
import com.example.webbanhang.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product,Integer> {
    @Query("select o from Product o where o.category.idCategory=?1")
    List<Product> findAllByIdCategory(Integer idCategory);

    @Query("select o from Product o where o.category.idCategory=?1 and o.productStyle.idProductStyle=?2")
    List<Product> findByIdCategoryAndIdProductStyle(Integer idCategory,Integer idProductStyle);

    List<Product> findAllByNameProductLike(String nameProduct);
}
