package com.redventures.ramengo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redventures.ramengo.DTO.BrothDTO;
import com.redventures.ramengo.entities.Broth;
import com.redventures.ramengo.repositories.BrothRepository;

@Service
public class BrothService {
	
	@Autowired
	private BrothRepository brothRepository;

	public List<BrothDTO> findAll(){
		List<Broth> result = brothRepository.findAll();
		return result.stream().map(b -> new BrothDTO(b)).toList();
	}
}
