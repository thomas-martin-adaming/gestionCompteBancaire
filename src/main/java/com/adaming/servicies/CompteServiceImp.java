package com.adaming.servicies;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adaming.entities.Compte;
import com.adaming.repositories.CompteRepository;

@Service
public class CompteServiceImp implements CompteService {

	@Autowired
	CompteRepository compteRepository;
	
	@Override
	public List<Compte> findAll() {
		return compteRepository.findAll();
	}
	@Override
	public Optional<Compte> findOne(Long id) {
		return compteRepository.findById(id);
	}
	@Override
	public Compte save(Compte compte) {	
		return compteRepository.save(compte);
	}
	@Override
	public void delete(Long id) {
		compteRepository.deleteById(id);
	}

}
