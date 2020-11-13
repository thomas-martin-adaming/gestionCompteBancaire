package com.adaming.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Utilisateur;
import com.adaming.servicies.UtilisateurService;

@RestController
public class UtilisateurController {

	@Autowired
	UtilisateurService utilisateurService;
	
	@RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@RequestMapping(value = "/utilisateurs/{id}", method = RequestMethod.GET)
	public Optional<Utilisateur> findOne(@PathVariable("id") Long id) {
		return utilisateurService.findOne(id);
	}

	@RequestMapping(value = "/utilisateurs", method = RequestMethod.POST)
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.save(utilisateur);
	}

	@RequestMapping(value = "/utilisateurs/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		utilisateurService.delete(id);
	}
	
}
