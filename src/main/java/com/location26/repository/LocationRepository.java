package com.location26.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location26.entity.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {

}
