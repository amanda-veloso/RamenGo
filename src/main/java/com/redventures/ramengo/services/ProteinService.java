package com.redventures.ramengo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redventures.ramengo.DTO.ProteinDTO;
import com.redventures.ramengo.entities.Protein;
import com.redventures.ramengo.repositories.ProteinRepository;

@Service
public class ProteinService {
	
	@Autowired
	ProteinRepository proteinRepository;
	
	public List<ProteinDTO> findAll(){
		List<Protein> result = proteinRepository.findAll();
		return result.stream().map(p ->  new ProteinDTO(p)).toList();
	}

}
