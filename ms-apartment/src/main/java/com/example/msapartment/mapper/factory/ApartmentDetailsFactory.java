package com.example.msapartment.mapper.factory;

import com.example.msapartment.dao.entity.ApartmentDetailEntity;
import com.example.msapartment.dao.entity.ApartmentEntity;
import org.springframework.stereotype.Component;

@Component
public class ApartmentDetailsFactory {

    public static ApartmentDetailEntity buildDetailToEntity(ApartmentEntity apartment,String owner,String address){
        return ApartmentDetailEntity.builder()
                .apartment(apartment)
                .owner(owner)
                .address(address)
                .build();
    }
}
