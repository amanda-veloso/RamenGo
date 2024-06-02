package com.redventures.ramengo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redventures.ramengo.DTO.BrothDTO;
import com.redventures.ramengo.services.BrothService;

@RestController
@RequestMapping(value = "/broths")
public class BrothController {
	
	@Autowired
	private BrothService brothService;
	
	@GetMapping
	public List<BrothDTO> findAll(){
		List<BrothDTO> result = brothService.findAll();
		return result;
	}

}
