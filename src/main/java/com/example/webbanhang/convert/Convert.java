package com.example.webbanhang.convert;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@RequiredArgsConstructor
public class Convert {
    private final ModelMapper modelMapper;

    // Các phương thức toDto và toEntity sẽ sử dụng trực tiếp 'modelMapper' đã được tiêm vào constructor.

    public <E, EDTO> EDTO toDto(E entity, Class<EDTO> DTOClass) {
        EDTO DTO = modelMapper.map(entity, DTOClass);
        return DTO;
    }

    public <E, EDTO> E toEntity(EDTO DTO, Class<E> EClass) {
        E entity = modelMapper.map(DTO, EClass);
        return entity;
    }
}
