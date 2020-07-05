package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.fiche;
import com.example.demo.service.IficheServie;

@RestController
@RequestMapping("/api/fiche")
@CrossOrigin
public class FicheController {
	@Autowired
	 private IficheServie ficheservice;
	@GetMapping
	public List<fiche> getFiche() {
		return ficheservice.getFiche();
		
	}
	@PostMapping
	public void addFiche(@RequestBody fiche fiche) {
		ficheservice.addFiche(fiche);
	}
	@PutMapping
	public void updateFiche(@RequestBody fiche fiche) {
		ficheservice.updateFiche(fiche);
		
		
	}
	@DeleteMapping("/{id}")
	public void deleteFiche(@PathVariable Long id) {
		
		ficheservice.deleteFiche(id);
		
	}

}
