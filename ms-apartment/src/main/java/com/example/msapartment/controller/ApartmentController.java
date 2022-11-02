package com.example.msapartment.controller;

import com.example.msapartment.model.ApartmentDto;
import com.example.msapartment.model.ResidentDto;
import com.example.msapartment.service.ApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/apartments")
public class ApartmentController {
    private final ApartmentService apartmentService;


    @GetMapping
    public List<ApartmentDto> getApartment() {
        return apartmentService.getApartment();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveApartment(@RequestBody ApartmentDto dto){
        apartmentService.saveApartment(dto);

    }


    @PatchMapping("/{id}/residents")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addCommentToPost(@PathVariable Long id,
                                 @RequestBody ResidentDto dto) {
        apartmentService.saveApartmentResident(id,dto);
    }


}
