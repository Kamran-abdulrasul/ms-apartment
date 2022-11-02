package com.example.msapartment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResidentDto {
    private Long id;
    private String name;
    private String surname;
    private Boolean status;


}
