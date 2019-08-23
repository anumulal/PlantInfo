package com.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.domain.PlantDetails;
import com.info.exception.ResourceNotFoundException;
import com.info.repository.PlantDetailsRepository;
@Service
public class ProcessPlantDetails {

	@Autowired 
	private PlantDetailsRepository plantDetailsRepository;

	@Autowired
	public PlantDetails plantDetails;
	
	public PlantDetails createPlantDetails(PlantDetails plantInfo) {
		return plantDetailsRepository.save(plantInfo);		
	}
	
	public PlantDetails getPlantDetails(Integer id) {
		return plantDetailsRepository.findById(id).
				 orElseThrow(() -> new ResourceNotFoundException("PlantDetails", "id", id));		
	}
	
	public void deletePlantDetails(Integer id) {
		plantDetailsRepository.deleteById(id);	
	}
	
	public PlantDetails updatePlantDetails(Integer id, PlantDetails plantInfo) {
		 plantDetails = plantDetailsRepository.findById(id).
				 orElseThrow(() -> new ResourceNotFoundException("PlantDetails", "id", id));
		 plantDetails.setPlantName(plantInfo.getPlantName());
		 plantDetails.setPlantType(plantInfo.getPlantType());
		return plantDetailsRepository.save(plantDetails);		
	}
	
	public List<PlantDetails> getPlants() {
		return plantDetailsRepository.findAll();		
	}

}
