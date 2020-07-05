package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class fiche {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id  ;
   private float cin  ;
    private String nom  ;
    private String prenom  ;
    private Long age;
   private float telephone;
    private String adresseMail;
	public fiche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public fiche( float cin, String nom, String prenom, long age, float telephone,String adresseMail) {
		super();
		
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.telephone = telephone;
		this.adresseMail = adresseMail;
	}
	
	
	public float getCin() {
		return cin;
	}
	public void setCin(float cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Long getAge() {
		return age;
	}
	public void setage(Long age) {
		this.age = age;
	}
	public float getTelephone() {
		return telephone;
	}
	public void setTelephone(float telephone) {
		this.telephone = telephone;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		fiche other = (fiche) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}




	

}
