package com.redventures.ramengo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redventures.ramengo.DTO.ProteinDTO;
import com.redventures.ramengo.services.ProteinService;

@RestController
@RequestMapping(value = "/proteins")
public class ProteinController {

	@Autowired
	ProteinService proteinService;

	@GetMapping
	public List<ProteinDTO> findAll() {
		List<ProteinDTO> result = proteinService.findAll();
		return result;

	}

}
