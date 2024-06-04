package com.redventures.ramengo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redventures.ramengo.DTO.OrderResponseDTO;
import com.redventures.ramengo.entities.Broth;
import com.redventures.ramengo.entities.Order;
import com.redventures.ramengo.entities.Protein;
import com.redventures.ramengo.repositories.BrothRepository;
import com.redventures.ramengo.repositories.OrderRepository;
import com.redventures.ramengo.repositories.ProteinRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private BrothRepository brothRepository;
	
	@Autowired
	private ProteinRepository proteinRepository;
	
	@Autowired
	private ApiService apiService;
	

    public OrderResponseDTO createOrder(Long brothId, Long proteinId) {
        Optional<Broth> broth = brothRepository.findById(brothId);
        Optional<Protein> protein = proteinRepository.findById(proteinId);
        
        

        if (!broth.isPresent() || !protein.isPresent()) {
            throw new IllegalArgumentException("Invalid broth or protein ID");
        }

        String description = String.format("%s and %s", broth.get().getName(), protein.get().getName());

        Order order = new Order();
        order.setBroth(broth.get());
        order.setProtein(protein.get());
        order.setDescription(description);
        order.setCodeOrder(apiService.getCodeOrder());
        return new OrderResponseDTO(orderRepository.save(order));
    }

}
