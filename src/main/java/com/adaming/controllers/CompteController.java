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

import com.adaming.entities.Compte;
import com.adaming.servicies.CompteService;

@RestController
public class CompteController {

	@Autowired
	CompteService compteService;

	@GetMapping(value = "/comptes")
	public List<Compte> findAll() {
		return compteService.findAll();
	}

	@GetMapping(value = "/comptes/{id}")
	public Optional<Compte> findOne(@PathVariable("id") Long id) {
		return compteService.findOne(id);
	}

	@PostMapping(value = "/comptes")
	public Compte save(@RequestBody Compte compte) {
		return compteService.save(compte);
	}

	@DeleteMapping(value = "/comptes/{id}")
	public void delete(@PathVariable("id") Long id) {
		compteService.delete(id);
	}
}
