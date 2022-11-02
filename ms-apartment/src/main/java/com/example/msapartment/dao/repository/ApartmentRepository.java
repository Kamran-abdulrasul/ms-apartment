package com.example.msapartment.dao.repository;

import com.example.msapartment.dao.entity.ApartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<ApartmentEntity,Long> {
}
