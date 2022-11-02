package com.example.msapartment.service;

import com.example.msapartment.dao.entity.ApartmentDetailEntity;
import com.example.msapartment.dao.entity.ApartmentEntity;
import com.example.msapartment.dao.repository.ApartmentRepository;
import com.example.msapartment.mapper.factory.ApartmentDetailsFactory;
import com.example.msapartment.mapper.factory.ApartmentFactory;
import com.example.msapartment.mapper.ApartmentMapper;
import com.example.msapartment.mapper.factory.ResidentFactory;
import com.example.msapartment.model.ApartmentDto;
import com.example.msapartment.model.ResidentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApartmentService {


    private final ApartmentRepository apartmentRepository;
    private final ResidentFactory residentFactory;

    public List<ApartmentDto> getApartment() {
        var apartment = apartmentRepository.findAll()
                .stream()
                .map(ApartmentMapper::mapEntityToDto)
                .collect(Collectors.toList());
        return apartment;

    }


    public void saveApartment(ApartmentDto dto) {
        log.info("Start");
        var apartment = ApartmentFactory.buildApartmentToEntity(dto);
        var apartmentDetail = ApartmentDetailsFactory.buildDetailToEntity(apartment, dto.getOwner(), dto.getAddress());

        /*
        ApartmentDetailEntity detail = new ApartmentDetailEntity();
        detail.setApartment(new ApartmentEntity());
        detail.setAddress();
        detail.setOwner();
        detail.setId();
        */

        apartment.setDetail(apartmentDetail);
        apartmentRepository.save(apartment);
        log.info("Success");
    }

    public void saveApartmentResident(Long id, ResidentDto dto){
        log.info("Start Save apartment Resident");
        var apartment=apartmentRepository.findById(id).orElseThrow();

        var resident=apartment.getResidentEntities();

        resident.add(residentFactory.buildResidentToEntity(apartment,dto));

        apartment.setResidentEntities(resident);

        apartmentRepository.save(apartment);

        log.info("Success Save apartment Resident");



    }


}
