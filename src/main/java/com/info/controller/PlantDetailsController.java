package com.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.domain.PlantDetails;
import com.info.service.ProcessPlantDetails;


@RestController
@RequestMapping("/plantInformation")
@CrossOrigin
public class PlantDetailsController { 
	@Autowired
	public PlantDetails plantDetails;		
	@Autowired
	public ProcessPlantDetails processPlantDetails;
	
	@PostMapping("/plantInfo")
	public ResponseEntity<PlantDetails> postPlantDetails(@RequestBody PlantDetails plantInfo){
		plantDetails = processPlantDetails.createPlantDetails(plantInfo);
		return ResponseEntity.ok(plantDetails);

	}
	
	@GetMapping("/{id}")
	public PlantDetails getPlantDetails(@PathVariable Integer id) {		
		return processPlantDetails.getPlantDetails(id);
		
	}
	
	@GetMapping("/")
	public List<PlantDetails> getPlants() {			
		return processPlantDetails.getPlants();		
	}
	
	@DeleteMapping("/{id}")
	public void deletePlantDetails(@PathVariable Integer id) {		
		processPlantDetails.deletePlantDetails(id);
		
	}
	
	@PutMapping("/{id}")
	public PlantDetails updatePlantDetails(@PathVariable Integer id,@RequestBody PlantDetails plantInfo) {		
		return processPlantDetails.updatePlantDetails(id,plantInfo);
		
	}
}

