package com.example.webbanhang.serviceImpl;

import com.example.webbanhang.DAO.FavoriteDAO;
import com.example.webbanhang.DTO.FavoriteDTO;
import com.example.webbanhang.convert.Convert;
import com.example.webbanhang.entity.Favorite;
import com.example.webbanhang.service.FavoriteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;




@Service
@RequiredArgsConstructor
@Slf4j
public class FavoriteServiceImpl implements FavoriteService {
	
	private final FavoriteDAO favoriteDAO;

	private final Convert convert;

    @Override
    public List<FavoriteDTO> findAll() {
    	return favoriteDAO.findAll().stream().map(t -> convert.toDto(t, FavoriteDTO.class) ).collect(Collectors.toList());
    }

    @Override
    public FavoriteDTO findById(Integer id) {
        return null;
    }

    @Override @Transactional(rollbackFor = {Exception.class, Throwable.class})
    public FavoriteDTO create(FavoriteDTO favoriteDto) {
        Favorite favorite = convert.toEntity(favoriteDto,Favorite.class);
        FavoriteDTO favoriteDTO = convert.toDto(favoriteDAO.save(favorite),FavoriteDTO.class);
        return favoriteDTO;
    }

    @Override @Transactional(rollbackFor = {Exception.class, Throwable.class})
    public void update(FavoriteDTO FavoriteDto) {

    }

    @Override
    public void remove(Integer id) {
        favoriteDAO.deleteById(id);
    }
    @Override
    public Integer checkExistsFavorite(String idUsername, Integer idProduct) {
        return favoriteDAO.checkExistsByIdProductAndUserName(idProduct,idUsername);
    }

    
}
