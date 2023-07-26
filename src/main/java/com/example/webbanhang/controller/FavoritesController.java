package com.example.webbanhang.controller;

import com.example.webbanhang.DTO.FavoriteDTO;
import com.example.webbanhang.service.FavoriteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/")
@RequiredArgsConstructor
public class FavoritesController {
    private final FavoriteService favoriteService;

    @GetMapping("user/favorites")
    public ResponseEntity<List<FavoriteDTO>> getFavorites() {
        return ResponseEntity.ok(favoriteService.findAll());
    }

    @PostMapping("user/favorites")
    public ResponseEntity<?> favorite(@RequestBody FavoriteDTO favoriteDTO) {
        Integer liked = favoriteService.checkExistsFavorite(favoriteDTO.getIdUsernameAccount(), favoriteDTO.getIdProduct());
        if (liked!=null){ //nếu đã like sản phẩm thì sẽ unlike
            deleteFavorite(liked);
            return ResponseEntity.ok(false);
        }
		else //ngược lại là like
            return ResponseEntity.status(HttpStatus.CREATED).body(favoriteService.create(favoriteDTO));
    }

    @DeleteMapping("user/favorites/{id}")
    public void deleteFavorite(@PathVariable Integer id) {
        favoriteService.remove(id);
    }
}


