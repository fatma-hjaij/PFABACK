package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class rendez_vous {

	public Long getIdR() {
		return idR;
	}
	public void setIdR(Long idR) {
		this.idR = idR;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idR  ;
	   private float cin  ;
	    private String nom_et_prenom  ;
	    private String dateDeRendezVous;
	   private String heure;
	    private String commentaire;
		public rendez_vous() {
			super();
		}
		
		public float getCin() {
			return cin;
		}
		public void setCin(float cin) {
			this.cin = cin;
		}
		public String getNom_et_prenom() {
			return nom_et_prenom;
		}
		public void setNom_et_prenom(String nom_et_prenom) {
			this.nom_et_prenom = nom_et_prenom;
		}
		public String getDateDeRendezVous() {
			return dateDeRendezVous;
		}
		public void setDateDeRendezVous(String dateDeRendezVous) {
			this.dateDeRendezVous = dateDeRendezVous;
		}
		public String getHeure() {
			return heure;
		}
		public void setHeure(String heure) {
			this.heure = heure;
		}
		public String getCommentaire() {
			return commentaire;
		}
		public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
		}
		public rendez_vous(Long idR, float cin, String nom_et_prenom, String dateDeRendezVous, String heure,
				String commentaire) {
			super();
			this.idR = idR;
			this.cin = cin;
			this.nom_et_prenom = nom_et_prenom;
			this.dateDeRendezVous = dateDeRendezVous;
			this.heure = heure;
			this.commentaire = commentaire;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idR == null) ? 0 : idR.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			rendez_vous other = (rendez_vous) obj;
			if (idR == null) {
				if (other.idR != null)
					return false;
			} else if (!idR.equals(other.idR))
				return false;
			return true;
		}

}
