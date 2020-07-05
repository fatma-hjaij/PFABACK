package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.rendez_vous;

public interface Irendez_vousService {
	List<rendez_vous> getRendezVous();
	void addRendezVous(rendez_vous rendez_vous);
	void updateRendezVous(rendez_vous rendez_vous);
	void deleteRendezVous(Long idR);		

}
