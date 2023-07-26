package com.example.webbanhang.DAO;

import com.example.webbanhang.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteDAO extends JpaRepository<Favorite,Integer> {
	
    @Query("select o.idFavorite from Favorite o where o.product.idProduct=?1 and o.account.idUsername=?2")
    Integer checkExistsByIdProductAndUserName(Integer idProduct,String idUsername);
}
