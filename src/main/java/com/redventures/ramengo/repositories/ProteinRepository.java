package com.redventures.ramengo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redventures.ramengo.entities.Protein;

public interface ProteinRepository extends JpaRepository<Protein, Long> {

}
