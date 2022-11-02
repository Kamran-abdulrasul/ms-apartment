package com.example.msapartment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveApartmentDetailDto {
    private Long id;
    private String owner;
    private String address;

}
