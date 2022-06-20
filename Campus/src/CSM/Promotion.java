package CSM;

import java.util.ArrayList;

public class Promotion {

	// attributs 

	String nomPromotion; 
	//les durée sont exprimée en pourcentage ou en heure
	int dureeTotalFormation; 
	int dureeTotalCentre;
	//la durée total dois etre | Durée total - durée centre - durée effectué|
	int dureeRealise;
	int nbApprenants; 
	String promoDiplomante;
	ArrayList<String> nbetudian = new ArrayList<>();


	@Override
	public String toString() {
		return "Promotion [nomPromotion=" + nomPromotion + ", dureeTotalFormation=" + dureeTotalFormation
				+ ", dureeTotalCentre=" + dureeTotalCentre + ", dureeRealise=" + dureeRealise + ", nbApprenants="
				+ nbApprenants + ", promoDiplomante=" + promoDiplomante + "]";
	}



	public Promotion(String nomPromotion, int dureeTotalFormation, int dureeTotalCentre, int dureeRealise,
			int nbApprenants, String promoDiplomante) {
		super();
		this.nomPromotion = Scan.scanString("Entre le nom de la promotion : ");
		nbetudian.add(nomPromotion);
		this.dureeTotalFormation = Scan.scanInteger("Renseignez le nombre d'heures :  ");
		this.dureeTotalCentre = Scan.scanInteger("Renseignez la durée ( en  poucentage ) passée au centre de formation : ");
		this.dureeRealise = Scan.scanInteger("Combien d'heure on deja etait faite ( en heure ) : ");
		this.nbApprenants = getNbApprenants();
		this.promoDiplomante = Scan.scanString("La promotion est-elle diplomante ? [Y or N]");
	}




	public String getNomPromotion() {
		return nomPromotion;
	}

	public void setNomPromotion(String nomPromotion) {
		this.nomPromotion = nomPromotion;
	}

	public int getDureeTotalFormation() {
		return dureeTotalFormation;
	}

	public void setDureeTotalFormation(int dureeTotalFormation) {
		this.dureeTotalFormation = dureeTotalFormation;
	}

	public int getDureeTotalCentre() {
		return dureeTotalCentre;
	}

	public void setDureeTotalCentre(int dureeTotalCentre) {
		this.dureeTotalCentre = dureeTotalCentre;
	}
	public int getDureeRealise() {
		return dureeRealise;
	}
	public void setDureeRealise(int dureeRealise) {
		this.dureeRealise = dureeRealise;
	}
	
	//TODO corriger ceux bug 
	public int getNbApprenants() {
		int i = 0;
		while (i <=nbetudian.size())
		{
			if (nbetudian.contains(nomPromotion))
				{
					nbApprenants +=1;
				}
		}
		return nbApprenants;
	}
	
	public void setNbApprenants(int nbApprenants) {
		this.nbApprenants = nbApprenants;
	}
	public String getPromoDiplomante() {
		return promoDiplomante;
	}
	public void setPromoDiplomante(String promoDiplomante) {
		this.promoDiplomante = promoDiplomante;
	}

}
