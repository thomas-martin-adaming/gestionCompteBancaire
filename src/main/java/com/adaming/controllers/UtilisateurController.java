package com.adaming.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Utilisateur;
import com.adaming.servicies.UtilisateurService;

@RestController
public class UtilisateurController {

	@Autowired
	UtilisateurService utilisateurService;

	@GetMapping(value = "/utilisateurs")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping(value = "/utilisateurs/{id}")
	public Optional<Utilisateur> findOne(@PathVariable("id") Long id) {
		return utilisateurService.findOne(id);
	}

	@PostMapping(value = "/utilisateurs")
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.save(utilisateur);
	}

	@DeleteMapping(value = "/utilisateurs/{id}")
	public void delete(@PathVariable("id") Long id) {
		utilisateurService.delete(id);
	}	
}
