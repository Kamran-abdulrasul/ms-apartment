package com.example.msapartment.controller;

import com.example.msapartment.model.SaveServiceDto;
import com.example.msapartment.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/services")
public class ServiceController {

    private final ServiceService serviceService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveService(@RequestBody SaveServiceDto dto){
        serviceService.saveService(dto);

    }


}
