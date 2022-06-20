package CSM;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
				if(add.equals("Y")||add.equals("y"))
				{
					Promotion pro = new Promotion(add, 0, 0, 0, 0, add);
					promotion.add(pro);
					System.out.println(apprenant + "\n" + promotion);
					//System.out.println("voulez sauvegarder l'apprenant ? : [Y or N]");//TODO fichier txt
				}
			}
			else 
			{
				///start = false;
				System.exit(0);
				System.out.println("le programme c'est cloturé avec succée !");
			}
		}
	}

}
