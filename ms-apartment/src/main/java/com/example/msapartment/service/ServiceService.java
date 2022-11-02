package com.example.msapartment.service;

import com.example.msapartment.dao.repository.ServiceRepository;
import com.example.msapartment.mapper.factory.ServiceFactory;
import com.example.msapartment.model.SaveServiceDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceService {
    private final ServiceRepository serviceRepository;


    public void saveService(SaveServiceDto dto){
        log.info("Start");
        serviceRepository.save(ServiceFactory.buildServiceEntity(dto));
        log.info("success");
    }






}

