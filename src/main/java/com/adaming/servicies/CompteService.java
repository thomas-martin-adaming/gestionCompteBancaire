package com.adaming.servicies;

import java.util.List;
import java.util.Optional;

import com.adaming.entities.Compte;

public interface CompteService {

	List<Compte> findAll();
	Optional<Compte> findOne(Long id);
	Compte save (Compte compteCourant);
	void delete (Long id);
}
