package com.adaming.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.Compte;
import com.adaming.servicies.CompteService;

@RestController
public class CompteController {


	@Autowired
	CompteService compteService;
	
	@RequestMapping(value = "/comptes", method = RequestMethod.GET)
	public List<Compte> findAll() {
		return compteService.findAll();
	}

	@RequestMapping(value = "/comptes/{id}", method = RequestMethod.GET)
	public Optional<Compte> findOne(@PathVariable("id") Long id) {
		return compteService.findOne(id);
	}

	@RequestMapping(value = "/comptes", method = RequestMethod.POST)
	public Compte save(@RequestBody Compte compte) {
		return compteService.save(compte);
	}

	@RequestMapping(value = "/comptes/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		compteService.delete(id);
	}
}
