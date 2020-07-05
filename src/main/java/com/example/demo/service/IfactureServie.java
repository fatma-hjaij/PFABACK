package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.facture;


public interface IfactureServie {
	List<facture> getFacture();
	void addFacture(facture facture );
	void updateFacture(facture facture);
	void deleteFacture(Long idF);
	

}
