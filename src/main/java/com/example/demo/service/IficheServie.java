package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.fiche;

public interface IficheServie {
	List<fiche> getFiche();
	void addFiche(fiche fiche );
	void updateFiche(fiche fiche);
	void deleteFiche(Long id);
	

}
