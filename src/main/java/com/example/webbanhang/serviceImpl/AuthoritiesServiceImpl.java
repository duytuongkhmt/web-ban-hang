package com.example.webbanhang.serviceImpl;


import com.example.webbanhang.DAO.AuthoritiesDAO;
import com.example.webbanhang.DTO.AuthoritiesDTO;
import com.example.webbanhang.convert.Convert;
import com.example.webbanhang.entity.Authorities;
import com.example.webbanhang.service.AuthoritiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AuthoritiesServiceImpl implements AuthoritiesService {


    private final Convert convert;
    private final AuthoritiesDAO authoritiesDAO;
    @Override
    public List<AuthoritiesDTO> findAll() {
        return null;
    }

    @Override
    public AuthoritiesDTO findById(Integer id) {
        return null;
    }

    @Override
    public AuthoritiesDTO create(AuthoritiesDTO authoritiesDTO) {
        Authorities authorities = convert.toEntity(authoritiesDTO, Authorities.class);
        return convert.toDto(authoritiesDAO.save(authorities),AuthoritiesDTO.class);
    }

    @Override
    public AuthoritiesDTO update(AuthoritiesDTO AuthoritiesDTO) {
        return null;
    }

    @Override
    public void remove(List<Integer> id) {

    }
}
