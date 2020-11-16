package com.adaming.servicies;

import java.util.List;
import java.util.Optional;
import com.adaming.entities.Utilisateur;

public interface UtilisateurService {
	List<Utilisateur> findAll();
	Optional<Utilisateur> findOne(Long id);
	Utilisateur save (Utilisateur utilisateur);
	void delete (Long id);
}
