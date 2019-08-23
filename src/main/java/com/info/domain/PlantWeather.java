package com.info.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Table(name = "plant_weather")
@Component
@Getter @Setter @ToString @NoArgsConstructor 
public class PlantWeather implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	//@Column(name = "plant_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer plantId;
	
	//@Column(name = "plant_name")
    private String weatherType;
	
	//@Column(name = "plant_type")
    private String waterRequirement;

}
