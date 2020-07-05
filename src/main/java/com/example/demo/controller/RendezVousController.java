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

import com.example.demo.entity.rendez_vous;
import com.example.demo.service.Irendez_vousService;


	@RestController
	@RequestMapping("/api/rendez_vous")
	@CrossOrigin
	public class RendezVousController {
		@Autowired
		 private Irendez_vousService rendez_vousService ;
		@GetMapping
		public List<rendez_vous> getRendezVous() {
			return rendez_vousService.getRendezVous();
			
		}
		@PostMapping
		public void addRendezVous(@RequestBody rendez_vous rendez_vous) {
			rendez_vousService.addRendezVous(rendez_vous);
		}
		@PutMapping
		public void updateRendezVous(@RequestBody rendez_vous rendez_vous) {
			rendez_vousService.updateRendezVous(rendez_vous);
			
			
		}
		@DeleteMapping("/{idR}")
		public void deleteRendezVous(@PathVariable Long idR) {
			
			rendez_vousService.deleteRendezVous(idR);
			
		}

	}



