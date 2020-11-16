package com.adaming.servicies;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adaming.entities.Utilisateur;
import com.adaming.repositories.UtilisateurRepository;

@Service
public class UtilisateurServiceImp implements UtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurRepository;
	@Override
	public List<Utilisateur> findAll() {
		return utilisateurRepository.findAll();
	}
	@Override
	public Optional<Utilisateur> findOne(Long id) {
		return utilisateurRepository.findById(id);
	}
	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	@Override
	public void delete(Long id) {
		utilisateurRepository.deleteById(id);
	}
}
