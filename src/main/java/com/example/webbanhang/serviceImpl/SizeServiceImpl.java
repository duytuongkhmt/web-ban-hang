package com.example.webbanhang.serviceImpl;
import com.example.webbanhang.DAO.SizeDAO;
import com.example.webbanhang.DTO.SizeDTO;
import com.example.webbanhang.convert.Convert;
import com.example.webbanhang.entity.Size;
import com.example.webbanhang.service.SizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class SizeServiceImpl implements SizeService {
    private final SizeDAO sizeDAO;
    private final Convert convert;
    @Override
    public List<SizeDTO> findAll() {
        List <Size> sizes = sizeDAO.findAll();
        List <SizeDTO> sizeDTOs =  sizes.stream().map(size -> convert.toDto( size, SizeDTO.class))
                .collect(Collectors.toList());
        return sizeDTOs;
    }

    @Override
    public SizeDTO findById(Integer id) {
        return convert.toDto(sizeDAO.findById(id).get(),SizeDTO.class);
    }

    @Override @Transactional(rollbackFor = {Exception.class, Throwable.class})
    public SizeDTO create(SizeDTO SizeDto) {
        return convert.toDto(sizeDAO.save(convert.toEntity(SizeDto, Size.class)), SizeDTO.class);
    }

    @Override @Transactional(rollbackFor = {Exception.class, Throwable.class})
    public SizeDTO update(SizeDTO SizeDto) {
        return convert.toDto(sizeDAO.save(convert.toEntity(SizeDto, Size.class)), SizeDTO.class);
    }

    @Override @Transactional(rollbackFor = {Exception.class, Throwable.class})
    public void remove(List<Integer> id) {
        sizeDAO.deleteAllById(id);
    }
}
