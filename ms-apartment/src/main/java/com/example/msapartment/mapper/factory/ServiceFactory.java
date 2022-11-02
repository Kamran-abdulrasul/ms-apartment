package com.example.msapartment.mapper.factory;

import com.example.msapartment.dao.entity.ServiceEntity;
import com.example.msapartment.model.SaveServiceDto;

public class ServiceFactory {
    public static ServiceEntity buildServiceEntity(SaveServiceDto dto){
        return  ServiceEntity.builder()
                .id(dto.getId())
                .serviceName(dto.getName())
                .build();
    }
}
