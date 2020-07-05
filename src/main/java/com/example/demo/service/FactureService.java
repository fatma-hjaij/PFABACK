package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
 import com.example.demo.service.IfactureServie;
import com.example.demo.entity.facture;
import com.example.demo.repository.FactureRepository;
@Service
@Primary
public class FactureService implements IfactureServie{
	@Autowired
private FactureRepository FactureRepository ;


	
	@Override
	public List<facture> getFacture() {
		return FactureRepository.findAll();
	}

	@Override
	public void addFacture(facture facture) {
		FactureRepository.save(facture);
		
	}

	@Override
	public void updateFacture(facture facture) {
		FactureRepository.save(facture);
		
	}

	@Override
	public void deleteFacture(Long idF) {
		facture facture=new facture();
		facture.setIdF(idF);
		FactureRepository.delete(facture);
	}

}