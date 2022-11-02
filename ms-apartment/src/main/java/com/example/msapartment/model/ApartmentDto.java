package com.example.msapartment.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApartmentDto {
    private Long id;
    private String headline;
    private String owner;
    private String address;



}
