package com.example.msapartment.dao.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "resident")
public class ApartmentResidentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private ApartmentEntity apartment;




}