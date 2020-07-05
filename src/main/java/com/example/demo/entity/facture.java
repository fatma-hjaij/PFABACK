package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class facture {

	public Long getIdF() {
		return idF;
	}
	public void setIdF(Long idF) {
		this.idF = idF;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idF ;
	 private String date;
	    private String nometprenom;
	    private float montant;
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getNometprenom() {
			return nometprenom;
		}
		public void setNometprenom(String nometprenom) {
			this.nometprenom = nometprenom;
		}
		public float getMontant() {
			return montant;
		}
		public void setMontant(float montant) {
			this.montant = montant;
		}
		public facture(Long idF, String date, String nometprenom, float montant) {
			super();
			this.idF = idF;
			this.date = date;
			this.nometprenom = nometprenom;
			this.montant = montant;
		}
		public facture() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idF == null) ? 0 : idF.hashCode());
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
			facture other = (facture) obj;
			if (idF == null) {
				if (other.idF != null)
					return false;
			} else if (!idF.equals(other.idF))
				return false;
			return true;
		}
	
		}
		
		