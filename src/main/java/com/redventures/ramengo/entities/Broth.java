package com.redventures.ramengo.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_broth")
public class Broth {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String imageInactive;
	private String imageActive;
	private String name;
	private String description;
	private Number price;
	
	public Broth() {
		
	}

	public Broth(String id, String imageInactive, String imageActive, String name, String description, Number price) {
		this.id = id;
		this.imageInactive = imageInactive;
		this.imageActive = imageActive;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		Broth other = (Broth) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	



}
