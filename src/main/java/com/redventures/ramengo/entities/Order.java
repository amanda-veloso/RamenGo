package com.redventures.ramengo.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity   
@Table(name = "tb_order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "broth_id")
	private Long brothId;
	
	@Column(name = "protein_id")
	private Long proteinId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	
	public Order() {
		
	}

	public Order(Long id, Long brothId, Long proteinId, String description, String image) {
		super();
		this.id = id;
		this.brothId = brothId;
		this.proteinId = proteinId;
		this.description = description;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBrothId() {
		return brothId;
	}

	public void setBrothId(Long brothId) {
		this.brothId = brothId;
	}

	public Long getProteinId() {
		return proteinId;
	}

	public void setProteinId(Long proteinId) {
		this.proteinId = proteinId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	


}
