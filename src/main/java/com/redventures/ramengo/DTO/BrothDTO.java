package com.redventures.ramengo.DTO;

import com.redventures.ramengo.entities.Broth;

public class BrothDTO {

	private Long id;
	private String imageActive;
	private String name;
	private String description;
	private Number price;

	public BrothDTO() {

	}

	public BrothDTO(Broth entity) {
		id = entity.getId();
		imageActive = entity.getImageActive();
		name = entity.getName();
		description = entity.getDescription();
		price = entity.getPrice();
	}

	public Long getId() {
		return id;
	}
	
	public String getImageActive() {
		return imageActive;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Number getPrice() {
		return price;
	}
	
	

}
