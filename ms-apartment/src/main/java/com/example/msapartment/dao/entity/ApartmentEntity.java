package com.example.msapartment.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "apartments")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ApartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String headline;

    @OneToOne(
            mappedBy = "apartment",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public ApartmentDetailEntity detail;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "apartment"
    )
    @ToString.Exclude
    public List<ApartmentResidentEntity> residentEntities;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "apartment_service",
            joinColumns = @JoinColumn(name = "apartment_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")

    )
    @ToString.Exclude
    public List<ServiceEntity> serviceEntity;


}
