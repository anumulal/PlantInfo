/**
 * 
 */
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

/**
 * @author sri
 *
 */
@Entity
//@Table(name = "plant_details")
@Component
@Getter @Setter @ToString @NoArgsConstructor 
public class PlantDetails implements Serializable{
	public PlantDetails(int i, String string1, String string2) {
		this.plantId = i;
		this.plantName = string1;
		this.plantType = string2;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@Column(name = "plant_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer plantId;
	
	//@Column(name = "plant_name")
    private String plantName;
	
	//@Column(name = "plant_type")
    private String plantType;
}
