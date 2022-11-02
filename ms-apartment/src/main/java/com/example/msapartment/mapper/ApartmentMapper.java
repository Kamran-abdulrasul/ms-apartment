package com.example.msapartment.mapper;

import com.example.msapartment.dao.entity.ApartmentEntity;
import com.example.msapartment.model.ApartmentDto;
import lombok.Data;


public class ApartmentMapper {

public static ApartmentDto mapEntityToDto(ApartmentEntity entity){
    return new ApartmentDto(entity.getId(), entity.getHeadline(), entity.getDetail().getOwner(),entity.getDetail()
            .getAddress());
}
}
