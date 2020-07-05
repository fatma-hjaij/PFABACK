package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.fiche;
@Service
public class FicheMockServiceImpl implements IficheServie{
	 private List<fiche> fiches;

	public FicheMockServiceImpl(){
	fiches = new ArrayList<fiche>();
		
    fiches.add(new fiche(1234,"hjaij","fatma",23,23704263,"fhggyy"));
    fiches.add(new fiche(15555,"hjaij","fatma",20,23704263,"fhggyy"));
	}
	@Override
	public List<fiche> getFiche() {
		return fiches;
	}

	@Override
	public void addFiche(fiche fiche) {
		fiches.add(fiche);
	}

	@Override
	public void updateFiche(fiche fiche) {
		fiches.remove(fiche);
		fiches.add(fiche);
		
	}

	@Override
	public void deleteFiche(Long id) {
		fiche fiche = new fiche();
		fiche.setId(id);
		fiches.remove(fiche);
		
	}

}
