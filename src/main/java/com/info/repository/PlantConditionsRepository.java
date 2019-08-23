package com.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.domain.PlantWeather;

@Repository
public interface PlantConditionsRepository extends JpaRepository<PlantWeather, Integer>{

}
