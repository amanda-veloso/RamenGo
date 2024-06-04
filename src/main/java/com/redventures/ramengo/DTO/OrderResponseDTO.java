package com.redventures.ramengo.DTO;

import com.redventures.ramengo.entities.Order;

public class OrderResponseDTO {

	private String codeOrder;
	private String description;
	private String image;

	public OrderResponseDTO() {

	}

	public OrderResponseDTO(Order entity) {
		codeOrder = entity.getCodeOrder();
		description = entity.getDescription();
		image = entity.getImage();
	}

	public String getcodeOrder() {
		return codeOrder;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

}
