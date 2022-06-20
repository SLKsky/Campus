package CSM;

import java.util.Scanner;

public class Apprenants {
	
	String nom;
	String prenom;
	String date;
	String contact;
	String contact1;
	String nom_entreprise;
	String date_inscription;
	String typeContrat;
	double salaire;
	
	
	
	
	
	public Apprenants(String nom, String prenom, String date, String contact, String contact1, String nom_entreprise,
			String date_inscription, String typeContrat, double salaire) {
		super();
		this.nom = Scan.scanString("Renseignez le Nom de l'Apprenant : ");
		this.prenom =   Scan.scanString("Renseignez le Prénom : ");
		this.contact =  Scan.scanString("Renseignez la 1ère personne de confiance : ");
		this.contact1 =  Scan.scanString("Renseignez la 2ème personne de confiance : ");
		this.nom_entreprise =  Scan.scanString("Renseignez l'Entreprise : ");
		this.date_inscription =  Scan.scanString("Renseignez la Date d'inscription : ");
		this.typeContrat = Scan.scanString("Renseignez le type le contrat : [ Apprenant ou Stagaire ] ");
		this.salaire = Scan.scanInteger("Renseignez le salaire :");
		
		
	}

	

	@Override
	public String toString() {
		return   "\n----------------------------- \n" +	nom + "\n" +  prenom + "\n" +date  + "\n" + contact
				+  "\n" + contact1 + "\n" + nom_entreprise 
				+  "\n" + date_inscription  + "\n" + typeContrat + "\n" + salaire + "\n-----------------------------\n";
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



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getContact1() {
		return contact1;
	}



	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}



	public String getNom_entreprise() {
		return nom_entreprise;
	}



	public void setNom_entreprise(String nom_entreprise) {
		this.nom_entreprise = nom_entreprise;
	}



	public String getDate_inscription() {
		return date_inscription;
	}



	public void setDate_inscription(String date_inscription) {
		this.date_inscription = date_inscription;
	}



	public String getTypeContrat() {
		return typeContrat;
	}



	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}



	
}