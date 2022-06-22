package CSM;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		fenetre f = new fenetre();
		f.setVisible(true);
		
		int appnb = 0;
		ArrayList<Apprenants> apprenant = new ArrayList<>();
		ArrayList<Promotion> promotion = new ArrayList<>();
		ad(apprenant, promotion);
		
		
	}


	public static void ad(ArrayList<Apprenants> apprenant, ArrayList<Promotion> promotion)
	{
		boolean start = true;

		while (start = true)
		{
			Scanner addScann = new Scanner(System.in);
			System.out.println("Voulez- vous entrée un nouveaux apprenant : [Y or N]");
			String add = addScann.nextLine();
			if (add.equals("Y")|| add.equals("y"))

			{
				Apprenants app = new Apprenants(null, null, null, null, null, null, null, add, 0);
				apprenant.add(app);
				System.out.println(" Ajoutez cet apprenant à une promotion : [Y or N] ");
				String chx = addScann.nextLine();
				if(chx.equals("Y")||chx.equals("y"))
				{
					Promotion pro = new Promotion(add, 0, 0, 0, 0, add);
					promotion.add(pro);
					System.out.println(apprenant + "\n" + promotion);
					System.out.println("voulez sauvegarder l'apprenant ? : [Y or N]");
					String save = addScann.nextLine();
					if (save.equals("Y")|| save.equals("y"))
					{
						condisave();
					}
				}
			}
			else 
			{
				System.out.println("le programme c'est cloturé avec succée !");
				System.exit(0);
			}
		}
	}
	
	public static void condisave()
	{
		//SANS INTERFACE GRAPHIQUE 
		
		//créé la fontion de savaugarde en txt 
		//créé 5 fichier txt au nom des formation dispo 
		//reussire via condition a ajouter l'apprenant (avec absolument toute les info) dans ça formation via l'attribue  nomPromotion 
		//cree un fichier txt qui contien tout les apprenant sans filtre
		
		System.out.println("A ajouter dans l'avenir !");
	}

}
