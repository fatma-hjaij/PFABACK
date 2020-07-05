package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.fiche;
import com.example.demo.repository.FicheRepository;
@Service
@Primary
public class FicheService implements IficheServie{
	@Autowired
private FicheRepository ficheRepository ;
	@Override
	public List<fiche> getFiche() {
		
		return ficheRepository.findAll();
	}

	@Override
	public void addFiche(fiche fiche) {
		ficheRepository.save(fiche);
		
	}

	@Override
	public void updateFiche(fiche fiche) {
		ficheRepository.save(fiche);
		
	}

	@Override
	public void deleteFiche(Long id) {
	fiche fiche=new fiche();
	fiche.setId(id);
	ficheRepository.delete(fiche);
	}

}
