package com.example.msapartment.mapper.factory;

import com.example.msapartment.dao.entity.ApartmentEntity;
import com.example.msapartment.model.ApartmentDto;
import org.springframework.stereotype.Component;

@Component
public class ApartmentFactory {
    public static ApartmentEntity buildApartmentToEntity(ApartmentDto dto){
        return ApartmentEntity.builder()
                .headline(dto.getHeadline())
                .build();
    }
}
