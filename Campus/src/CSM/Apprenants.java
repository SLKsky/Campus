package CSM;

import java.awt.TextField;
import java.util.Scanner;

import javax.swing.JTextField;

public class Apprenants  extends fenetre{
	
	String nom;
	String prenom;
	String date;
	String telephone;
	String mail;
	String nom_entreprise;
	String date_inscription;
	String typeContrat;
	String salaire;
	
	
	
	
	
	public Apprenants(String nom, String prenom, String date, String telephone , String mail, String nom_entreprise,
			String date_inscription, String typeContrat, double salaire) {
		super();
		this.nom = txtNom.getText();
		this.prenom =  txtPrenom.getText();
		this.telephone =  txtSalaire.getText();
		this.mail =  txtMail.getText();
		this.nom_entreprise =  txtNomEntreprise.getText();
		this.date_inscription =  txtDateDinscription.getText();
		this.typeContrat = txtTypeDeContrat.getText();
		//this.salaire = Scan.scanInteger("Renseignez le salaire :");
		
		
	}

	@Override
	public String toString() {
		return   "\n----------------------------- \n"+ "nom de famille de l'apprenant :" +	nom + "\n" + "Prénom de l'apprenant :"+ prenom + "\n"
				+ "\n"+ "Contacte en cas d'urgence " + telephone
				+  "\n" + "Contact en cas d'urgence n2 : "+  mail + "\n" +"Nom de l'entreprise : "+ nom_entreprise 
				+  "\n" +"Date d'inscription : "+ date_inscription  + "\n"+"Type de contrat :" + typeContrat + "\n"+ "Montant du salaire :" + salaire +"€" +"\n-----------------------------\n";
	}
	
	public String gettoString()
	{
		return toString();
		
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



	public String setPrenom(String prenom) {
		return this.prenom = prenom;
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



	public String getSalaire() {
		return salaire;
	}



	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}



	
}