package CSM;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Fen extends JFrame implements ActionListener{
	

	private static final long serialVersionUID = 4648172894076113183L;
	
	private JButton btnnom;


	//fonction Jfram
	public Fen()

	{
		super ("Getionnaire Etudian");
		//permet l'arret du programme quand on clic sur la croix
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//taille a l'ouvertur Warn la taille dois toujour etre specifier avant le placements
		this.setSize(new Dimension( 600, 400));

		//location apres avoir spe la taille (null) egale centre
		this.setLocationRelativeTo(null);



		//recuperation du conteneur 
		JPanel contentpane = (JPanel)this.getContentPane();
		contentpane.setLayout(new FlowLayout());


		//button
		JButton btnajoute = new JButton("Ajout");
		btnajoute.addActionListener(this);
		contentpane.add(btnajoute);

		JButton btnsupr = new JButton("Supprimer");
		btnsupr.addActionListener(this);
		contentpane.add(btnsupr);

		JButton btnjava = new JButton("JAVA");
		btnjava.addActionListener(this);
		contentpane.add(btnjava);

		JButton btnphp = new JButton("PHP");
		btnphp.addActionListener(this);
		contentpane.add(btnphp);

		JButton btnSQL = new JButton("SQL");
		btnSQL.addActionListener(this);
		contentpane.add(btnSQL);

		JButton btnc = new JButton("C");
		btnc.addActionListener(this);
		contentpane.add(btnc);

		JButton btnpython = new JButton("PYTHON");
		btnpython.addActionListener(this);
		contentpane.add(btnpython);
		
		//button qui sont cacher 
		btnnom = new JButton("Nom");
		contentpane.add(btnnom);
		btnnom.setVisible(false);
		


		JTextArea textzone= new JTextArea();

	}



	public void actionPerformed(ActionEvent e){
		actionperf(e, btnnom);
	}
	
	public void actionperf(ActionEvent e , JButton btnnom)
	{
		if (((JButton)e.getSource()).getText().equals("Ajout"))
		{
			btnnom.setVisible(true);
		}
		else if (((JButton)e.getSource()).getText().equals("Supprimer"))
		{

		}
		else if (((JButton)e.getSource()).getText().equals("JAVA"))
		{

		}
		else if (((JButton)e.getSource()).getText().equals("PHP"))
		{

		}
		else if (((JButton)e.getSource()).getText().equals("SQL"))
		{

		}
		else if (((JButton)e.getSource()).getText().equals("C"))
		{

		}
		else if (((JButton)e.getSource()).getText().equals("PYTHON"))
		{

		}else if(e.getSource().equals(btnnom)) {
			
		}
	}

}





