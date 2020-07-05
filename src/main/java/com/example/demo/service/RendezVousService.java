package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.rendez_vous;
import com.example.demo.repository.RendezVousRepository;
@Service
@Primary
public class RendezVousService implements Irendez_vousService{
	@Autowired
private RendezVousRepository RendezVousRepository ;


	
	@Override
	public List<rendez_vous> getRendezVous() {
		return RendezVousRepository.findAll();
	}

	@Override
	public void addRendezVous(rendez_vous rendez_vous) {
		RendezVousRepository.save(rendez_vous);
		
	}

	@Override
	public void updateRendezVous(rendez_vous rendez_vous) {
		RendezVousRepository.save(rendez_vous);
		
	}

	@Override
	public void deleteRendezVous(Long idR) {
		rendez_vous rendez_vous=new rendez_vous();
		rendez_vous.setIdR(idR);
		RendezVousRepository.delete(rendez_vous);
	}

}