package com.example.demo.controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.facture;
import com.example.demo.service.IfactureServie;



	@RestController
	@RequestMapping("/api/facture")
	@CrossOrigin
	public class FactureController {
		@Autowired
		 private IfactureServie factureService ;
		@GetMapping
		public List<facture> getFacture() {
			return factureService.getFacture();
			
		}
		@PostMapping
		public void addFacture(@RequestBody facture facture) {
			factureService.addFacture(facture);
		}
		@PutMapping
		public void updateFacture(@RequestBody facture facture) {
			factureService.updateFacture(facture);
			
			
		}
		@DeleteMapping("/{idF}")
		public void deleteFacture(@PathVariable Long idF) {
			
			factureService.deleteFacture(idF);
			
		}
		
		@RequestMapping(value="/uploadFiles",method=RequestMethod.POST)
		public ResponseEntity<String>  uploadMultipleFiles(@RequestParam("files") MultipartFile files) {
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+files.getOriginalFilename());
			
			String msg = "Files uploaded successfully";
		    return ResponseEntity.status(HttpStatus.OK).body(msg);
		}
		
	}