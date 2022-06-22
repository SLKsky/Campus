package CSM;

import java.util.Scanner;

public class Apprenants {
	
	String nom;
	String prenom;
	String date;
	String telephone;
	String mail;
	String nom_entreprise;
	String date_inscription;
	String typeContrat;
	double salaire;
	
	
	
	
	
	public Apprenants(String nom, String prenom, String date, String telephone , String mail, String nom_entreprise,
			String date_inscription, String typeContrat, double salaire) {
		super();
		this.nom = Scan.scanString("Renseignez le Nom de l'Apprenant : ");
		this.prenom =   Scan.scanString("Renseignez le Prénom : ");
		this.telephone =  Scan.scanString("Renseignez un numero de telephone : ");
		this.mail =  Scan.scanString("Renseignez une adrese mail : ");
		this.nom_entreprise =  Scan.scanString("Renseignez l'Entreprise : ");
		this.date_inscription =  Scan.scanString("Renseignez la Date d'inscription : ");
		this.typeContrat = Scan.scanString("Renseignez le type le contrat : [ Apprenant ou Stagaire ] ");
		this.salaire = Scan.scanInteger("Renseignez le salaire :");
		
		
	}

	

	@Override
	public String toString() {
		return   "\n----------------------------- \n"+ "nom de famille de l'apprenant :" +	nom + "\n" + "Prénom de l'apprenant :"+ prenom + "\n"
				+ "\n"+ "Contacte en cas d'urgence " + telephone
				+  "\n" + "Contact en cas d'urgence n2 : "+  mail + "\n" +"Nom de l'entreprise : "+ nom_entreprise 
				+  "\n" +"Date d'inscription : "+ date_inscription  + "\n"+"Type de contrat :" + typeContrat + "\n"+ "Montant du salaire :" + salaire +"€" +"\n-----------------------------\n";
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
		return telephone;
	}



	public void setContact(String contact) {
		this.telephone = contact;
	}



	public String getContact1() {
		return mail;
	}



	public void setContact1(String contact1) {
		this.mail = contact1;
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