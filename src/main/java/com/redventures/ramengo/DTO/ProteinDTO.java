package com.redventures.ramengo.DTO;

import com.redventures.ramengo.entities.Protein;

public class ProteinDTO {

	private Long id;
	private String imageInactive;
	private String imageActive;
	private String Name;
	private String description;
	private Number price;

	public ProteinDTO() {

	}

	public ProteinDTO(Protein entity) {
		id = entity.getId();
		imageInactive = entity.getImageInactive();
		imageActive = entity.getImageActive();
		Name = entity.getName();
		description = entity.getDescription();
		price = entity.getPrice();
	}

	public Long getId() {
		return id;
	}

	public String getImageInactive() {
		return imageInactive;
	}

	public String getImageActive() {
		return imageActive;
	}

	public String getName() {
		return Name;
	}

	public String getDescription() {
		return description;
	}

	public Number getPrice() {
		return price;
	}

}
