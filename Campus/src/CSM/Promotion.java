package CSM;

import java.util.ArrayList;

public class Promotion {
	boolean restart = true;

	// attributs 

	String nomPromotion; 
	//les durée sont exprimée en pourcentage ou en heure
	int dureeTotalFormation; 
	int dureeTotalCentre;
	//la durée total dois etre | Durée total - durée centre - durée effectué|
	int dureeRealise;
	int nbApprenants; 
	String promoDiplomante;
	
	//5 liste de promotion divers
	ArrayList<Integer> java = new ArrayList<>();
	ArrayList<Integer> php = new ArrayList<>();
	ArrayList<Integer> sql = new ArrayList<>();
	ArrayList<Integer> c = new ArrayList<>();
	ArrayList<Integer> python = new ArrayList<>();


	@Override
	public String toString() {
		return "Promotion [nomPromotion=" + nomPromotion + ", dureeTotalFormation=" + dureeTotalFormation
				+ ", dureeTotalCentre=" + dureeTotalCentre + ", dureeRealise=" + dureeRealise + ", nbApprenants de la promotion =" + nomPromotion +" est deux :"
				+ nbApprenants + ", promoDiplomante=" + promoDiplomante + "]";
	}



	public Promotion(String nomPromotion, int dureeTotalFormation, int dureeTotalCentre, int dureeRealise,
			int nbApprenants, String promoDiplomante) 
	{
		super();
		this.nomPromotion = Scan.scanString("Choisir la promo : [JAVA]-[PHP]-[SQL]-[C]-[PYTHON]");
		//focntion ajout name close
		ajout();
		this.dureeTotalFormation = Scan.scanInteger("Renseignez le nombre d'heures :  ");
		this.dureeTotalCentre = Scan.scanInteger("Renseignez la durée ( en  poucentage ) passée au centre de formation : ");
		this.dureeRealise = Scan.scanInteger("Combien d'heure on deja etait faite ( en heure ) : ");
		this.nbApprenants = getNbApprenants();//appelle a la fonction qui compte le nombre d'etudian dans la promotion instruite pas l'user ! 
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
	
	public int getNbApprenants() {
		int i = 0;
		
		if (nomPromotion.equals("java") || nomPromotion.equals("JAVA"))
		{
			while(i <= java.size())
			{
				i++;
			}
			nbApprenants = i ;
			
		}
		else if (nomPromotion.equals("php") || nomPromotion.equals("PHP"))
		{
			while(i <= php.size())
			{
				i++;
			}
			nbApprenants = i ;
		}
		else if (nomPromotion.equals("sql") || nomPromotion.equals("SQL"))
		{
			while(i <= sql.size())
			{
				i++;
			}
			nbApprenants = i ;
		}
		else if (nomPromotion.equals("c") || nomPromotion.equals("C"))
		{
			while(i <= c.size())
			{
				i++;
			}
			nbApprenants = i ;
		}
		else if (nomPromotion.equals("python") || nomPromotion.equals("PYTHON"))
		{
			while(i <= python.size())
			{
				i++;
			}
			nbApprenants = i ;
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
	
	public void ajout()
	{
		
		while(restart == true)
		{
		if (nomPromotion.equals("java") || nomPromotion.equals("JAVA"))
		{
			java.add(+1);
			restart = false;
		}
		else if (nomPromotion.equals("php") || nomPromotion.equals("PHP"))
		{
			php.add(+1);
			restart = false;
		}
		else if (nomPromotion.equals("sql") || nomPromotion.equals("SQL"))
		{
			sql.add(+1);
			restart = false;
		}
		else if (nomPromotion.equals("c") || nomPromotion.equals("C"))
		{
			c.add(+1);
			restart = false;
		}
		else if (nomPromotion.equals("python") || nomPromotion.equals("PYTHON"))
		{
			python.add(+1);
			restart = false;
		}
		else 
		{
			System.out.println("merci de n'entrée une promotion disponible !");
			restart = true;
		}
		}
		
	}
	
	
}
