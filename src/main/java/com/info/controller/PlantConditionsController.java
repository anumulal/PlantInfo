package com.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.domain.PlantWeather;
import com.info.service.ProcessPlantConditions;

@RestController
@RequestMapping("/plantConditions")
public class PlantConditionsController {
	
	@Autowired
	public PlantWeather plantWeather;
	@Autowired
	private ProcessPlantConditions ProcessPlantConditions;
	
	@PostMapping("/plantRequirements")
	public ResponseEntity<PlantWeather> postPlantConditions(@RequestBody PlantWeather plantRequirements){
		plantWeather = ProcessPlantConditions.createPlantConditions(plantRequirements);
		return ResponseEntity.ok(plantWeather);

	}
}
