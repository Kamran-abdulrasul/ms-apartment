package com.example.msapartment.mapper.factory;

import com.example.msapartment.dao.entity.ApartmentEntity;
import com.example.msapartment.dao.entity.ApartmentResidentEntity;
import com.example.msapartment.model.ResidentDto;
import org.springframework.stereotype.Component;

@Component
public class ResidentFactory {

    public ApartmentResidentEntity buildResidentToEntity(ApartmentEntity apartment,ResidentDto dto){
        return ApartmentResidentEntity.builder()
                .apartment(apartment)
                .id(dto.getId())
                .name(dto.getName())
                .surname(dto.getSurname())
                .status(dto.getStatus())
                .build();
    }
}
