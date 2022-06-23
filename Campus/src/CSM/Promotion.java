package CSM;

import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class Promotion  {
	boolean restart = true;

	// attributs 

	String nomPromotion; 
	//les durée sont exprimée en pourcentage ou en heure
	String dureeTotalFormation; 
	String dureeTotalCentre;
	//la durée total dois etre | Durée total - durée centre - durée effectué|
	String dureeRealise;
	//int nbApprenants; 
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
			+ ", promoDiplomante=" + promoDiplomante + "]";
	}



	public Promotion(String nomPromotion, String dureeTotalFormation, String dureeTotalCentre, String dureeRealise,
			 String promoDiplomante) 
	{
		super();

		this.nomPromotion = nomPromotion;
		//focntion ajout name close
		ajout();
		this.dureeTotalFormation = dureeTotalFormation;
		this.dureeTotalCentre = dureeTotalCentre;
		this.dureeRealise = dureeRealise;
		this.promoDiplomante = promoDiplomante;
		
	}


	public Promotion(String txtpromotion, JTextField txtdure, JTextField txtdureec, JTextField txtacuelle) {
		// TODO Auto-generated constructor stub
	
	}



	public String getNomPromotion() {
		return nomPromotion;
	}

	public void setNomPromotion(String nomPromotion) {
		this.nomPromotion = nomPromotion;
	}

	public String getDureeTotalFormation() {
		return dureeTotalFormation;
	}

	public void setDureeTotalFormation(String dureeTotalFormation) {
		this.dureeTotalFormation = dureeTotalFormation;
	}

	public String getDureeTotalCentre() {
		return dureeTotalCentre;
	}

	public void setDureeTotalCentre(String dureeTotalCentre) {
		this.dureeTotalCentre = dureeTotalCentre;
	}
	public String getDureeRealise() {
		return dureeRealise;
	}
	public void setDureeRealise(String dureeRealise) {
		this.dureeRealise = dureeRealise;
	}
	
//	public int getNbApprenants() {
//		int i = 0;
//		
//		if (nomPromotion.equals("java") || nomPromotion.equals("JAVA"))
//		{
//			while(i <= java.size())
//			{
//				i++;
//			}
//			nbApprenants = i ;
//			
//		}
//		else if (nomPromotion.equals("php") || nomPromotion.equals("PHP"))
//		{
//			while(i <= php.size())
//			{
//				i++;
//			}
//			nbApprenants = i ;
//		}
//		else if (nomPromotion.equals("sql") || nomPromotion.equals("SQL"))
//		{
//			while(i <= sql.size())
//			{
//				i++;
//			}
//			nbApprenants = i ;
//		}
//		else if (nomPromotion.equals("c") || nomPromotion.equals("C"))
//		{
//			while(i <= c.size())
//			{
//				i++;
//			}
//			nbApprenants = i ;
//		}
//		else if (nomPromotion.equals("python") || nomPromotion.equals("PYTHON"))
//		{
//			while(i <= python.size())
//			{
//				i++;
//			}
//			nbApprenants = i ;
//		}
//		return nbApprenants;
//	}
	
	
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
