package com.redventures.ramengo.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_protein")
public class Protein {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "image_inactive")
	private String imageInactive;
	
	@Column(name = "image_active")
	private String imageActive;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description",columnDefinition = "TEXT")
	private String description;
	
	@Column(name = "price")
	private Number price;
	
	public Protein() {
		
	}

	public Protein(Long id, String imageInactive, String imageActive, String name, String description, Number price) {
		this.id = id;
		this.imageInactive = imageInactive;
		this.imageActive = imageActive;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageInactive() {
		return imageInactive;
	}

	public void setImageInactive(String imageInactive) {
		this.imageInactive = imageInactive;
	}

	public String getImageActive() {
		return imageActive;
	}

	public void setImageActive(String imageActive) {
		this.imageActive = imageActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Number getPrice() {
		return price;
	}

	public void setPrice(Number price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Protein other = (Protein) obj;
		return Objects.equals(id, other.id);
	}
	

}
