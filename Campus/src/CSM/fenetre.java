package CSM;


import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class fenetre extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField txtPrenom;
	private JTextField txtDateDinscription;
	private JTextField txtNom;
	private JTextField txtSalaire;
	private JTextField txtTlphone;
	private JTextField txtTypeDeContrat;
	private JTextField txtNomEntreprise;
	private JTextField txtMail;
	private JButton button;
	private JButton btnNewButton;
	// private JRadioButton chckbxNewCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetre window = new fenetre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fenetre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		menuBar.setForeground(Color.GRAY);
		frame.setJMenuBar(menuBar);

		JMenuItem mntmNewMenuItem = new JMenuItem("ADD");
		mntmNewMenuItem.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem.addActionListener(this);
		menuBar.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Remove");
		menuBar.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("JAVA");
		menuBar.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("PHP");
		menuBar.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("C");
		menuBar.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("SQL");
		menuBar.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("PYTHON");
		menuBar.add(mntmNewMenuItem_6);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));


		txtNom = new JTextField();
		txtNom.setText("Nom");
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		txtNom.setVisible(false);


		button = new JButton("Promotion");
		frame.getContentPane().add(button);
		button.addActionListener(this);
		button.setVisible(false);

		txtPrenom = new JTextField();
		txtPrenom.setText("Prenom");
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		txtPrenom.setVisible(false);


		txtSalaire = new JTextField();
		txtSalaire.setText("Salaire");
		frame.getContentPane().add(txtSalaire);
		txtSalaire.setColumns(10);
		txtSalaire.setVisible(false);

		txtDateDinscription = new JTextField();
		txtDateDinscription.setText("Date d'inscription");
		frame.getContentPane().add(txtDateDinscription);
		txtDateDinscription.setColumns(10);
		txtDateDinscription.setVisible(false);

		txtTypeDeContrat = new JTextField();
		txtTypeDeContrat.setText("Type de contrat");
		frame.getContentPane().add(txtTypeDeContrat);
		txtTypeDeContrat.setColumns(10);
		txtTypeDeContrat.setVisible(false);

		txtTlphone = new JTextField();
		txtTlphone.setText("Téléphone");
		frame.getContentPane().add(txtTlphone);
		txtTlphone.setColumns(10);
		txtTlphone.setVisible(false);

		txtMail = new JTextField();
		txtMail.setText("Mail");
		frame.getContentPane().add(txtMail);
		txtMail.setColumns(10);
		txtMail.setVisible(false);

		txtNomEntreprise = new JTextField();
		txtNomEntreprise.setText("Nom Entreprise");
		frame.getContentPane().add(txtNomEntreprise);
		txtNomEntreprise.setColumns(10);
		txtNomEntreprise.setVisible(false);

		btnNewButton = new JButton("Valide");
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setVisible(false);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		//
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		visibleadd(e);
	}

	public void visibleadd(EventObject e)
	{
		if (((AbstractButton)e.getSource()).getText().equals("ADD"))
		{
			visibleaddall();

		}
		else if (((AbstractButton)e.getSource()).getText().equals("Promotion"))
		{
			visiblepopup();
		}
	}

	public void visibleaddall()
	{
		txtMail.setVisible(true);
		txtNomEntreprise.setVisible(true);
		txtNom.setVisible(true);
		button.setVisible(true);
		txtPrenom.setVisible(true);
		txtSalaire.setVisible(true);
		txtDateDinscription.setVisible(true);
		txtTypeDeContrat.setVisible(true);
		txtTlphone.setVisible(true);
		txtNomEntreprise.setVisible(true);
		btnNewButton.setVisible(true);
	}

	public void visiblepopup()
	{
		JFrame jFrame = new JFrame("Choisir la promo");


		jFrame.setBounds(500, 300, 400, 150);

		JPanel panel = new JPanel();
		JPanel panelLabel = new JPanel();
		JLabel jLabel = new JLabel("Press close button to close the dialog.");
		panelLabel.add(jLabel);
		ButtonGroup bg = new ButtonGroup();


		JRadioButton j = new JRadioButton("JAVA");
		panel.add(j);
		bg.add(j);


		JRadioButton p = new JRadioButton("PHP");
		panel.add(p);
		bg.add(p);


		JRadioButton c = new JRadioButton("C");
		panel.add(c);
		bg.add(c);


		JRadioButton s = new JRadioButton("SQL");
		panel.add(s);
		bg.add(s);


		JRadioButton py = new JRadioButton("PYTHON");
		panel.add(py);
		bg.add(py);

		JButton valide = new JButton("Valider");

		jFrame.getContentPane().add(BorderLayout.NORTH,panel);
		jFrame.getContentPane().add(BorderLayout.CENTER,panelLabel);
		jFrame.getContentPane().add(BorderLayout.SOUTH,valide);

		jFrame.setVisible(true);
		
		valide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//call another method in the same class which will close this Jframe
				jFrame.dispose();
			}
		});
		

	}
	
}
