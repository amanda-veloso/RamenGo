package com.redventures.ramengo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redventures.ramengo.DTO.OrderRequestDTO;
import com.redventures.ramengo.DTO.OrderResponseDTO;
import com.redventures.ramengo.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
 
	@Autowired
	private OrderService orderService;
	

    @PostMapping
    public ResponseEntity<OrderResponseDTO> createOrder(@RequestBody OrderRequestDTO orderRequest) {
        try {
            OrderResponseDTO createdOrder = orderService.createOrder(orderRequest.getBrothId(), orderRequest.getProteinId());
            return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
        	throw e;
        } catch(Exception e) {
        	throw new InternalError("Could not place order");
        }
        
    }
}
