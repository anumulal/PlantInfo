package com.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.domain.PlantWeather;
import com.info.repository.PlantConditionsRepository;
@Service
public class ProcessPlantConditions {
	@Autowired
	private PlantConditionsRepository plantConditionsRepository;
	/*
	 * @Autowired private PlantWeather plantWeather;
	 */
	
	public PlantWeather createPlantConditions(PlantWeather plantConditions) {
		return plantConditionsRepository.save(plantConditions);		
	}
	

}
