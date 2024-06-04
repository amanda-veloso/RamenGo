package com.redventures.ramengo.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity   
@Table(name = "tb_order")
public class Order {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_broth")
	private Broth broth;
	
	@ManyToOne
	@JoinColumn(name = "id_protein")
	private Protein protein;
	
	@Column(name = "code_order")
	private String codeOrder;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	
	public Order() {
		
	}

	public Order(Long id, Broth broth, Protein protein, String codeOrder, String description, String image) {
		this.id = id;
		this.broth = broth;
		this.protein = protein;
		this.codeOrder = codeOrder;
		this.description = description;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Broth getBroth() {
		return broth;
	}

	public void setBroth(Broth broth) {
		this.broth = broth;
	}
	
	public String getCodeOrder() {
		return codeOrder;
	}

	public void setCodeOrder(String codeOrder) {
		this.codeOrder = codeOrder;
	}

	public Protein getProtein() {
		return protein;
	}

	public void setProtein(Protein protein) {
		this.protein = protein;
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
