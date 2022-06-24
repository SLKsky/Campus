package CSM;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.*;

import java.awt.BorderLayout;

import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class fenetre extends JFrame implements ActionListener{


	private JFrame frame;
	protected JTextField txtPrenom;
	protected JTextField txtDateDinscription;
	protected JTextField txtNom;
	protected JTextField txtSalaire;
	protected JTextField txtTlphone;
	protected JTextField txtTypeDeContrat;
	protected JTextField txtNomEntreprise;
	protected JTextField txtMail;
	protected JTextField txtdure;
	protected JTextField txtdureec;
	protected JTextField txtacuelle;
	protected JTextField txtdip;
	protected String txtpromotion;
	private JButton button;
	private JButton btnNewButton;
	private JRadioButton chckbxNewCheckBox;
	private JTextField textField;
	JList<String> j = new JList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//try {
				fenetre window = new fenetre();
				window.frame.setVisible(true);
				//} catch (Exception e) {
				//	e.printStackTrace();
				//}
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
		mntmNewMenuItem.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem.addActionListener(this);
		menuBar.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("JAVA");
		mntmNewMenuItem_2.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem_2.addActionListener(this);
		menuBar.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("PHP");
		mntmNewMenuItem.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem.addActionListener(this);
		menuBar.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("C");
		mntmNewMenuItem.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem.addActionListener(this);
		menuBar.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("SQL");
		mntmNewMenuItem.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem.addActionListener(this);
		menuBar.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("PYTHON");
		mntmNewMenuItem.setForeground(Color.LIGHT_GRAY);
		mntmNewMenuItem.addActionListener(this);
		menuBar.add(mntmNewMenuItem_6);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));


		txtNom = new JTextField();
		txtNom.setText("Nom");
		txtNom.getText();
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		txtNom.setVisible(false);


		button = new JButton("Promotion");
		button.setName("Promotion");
		frame.getContentPane().add(button);
		button.addActionListener(this);
		button.setVisible(false);

		txtPrenom = new JTextField();
		txtPrenom.setText("Prenom");
		txtPrenom.getText();
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		txtPrenom.setVisible(false);


		txtSalaire = new JTextField();
		txtSalaire.setText("Salaire");
		txtSalaire.getText();
		frame.getContentPane().add(txtSalaire);
		txtSalaire.setColumns(10);
		txtSalaire.setVisible(false);

		txtDateDinscription = new JTextField();
		txtDateDinscription.setText("Date d'inscription");
		txtDateDinscription.getText();
		frame.getContentPane().add(txtDateDinscription);
		txtDateDinscription.setColumns(10);
		txtDateDinscription.setVisible(false);

		txtTypeDeContrat = new JTextField();
		txtTypeDeContrat.setText("Type de contrat");
		txtTypeDeContrat.getText();
		frame.getContentPane().add(txtTypeDeContrat);
		txtTypeDeContrat.setColumns(10);
		txtTypeDeContrat.setVisible(false);


		txtTlphone = new JTextField();
		txtTlphone.setText("Téléphone");
		txtTlphone.getText();
		frame.getContentPane().add(txtTlphone);
		txtTlphone.setColumns(10);
		txtTlphone.setVisible(false);

		txtMail = new JTextField();
		txtMail.setText("Mail");
		txtMail.getText();
		frame.getContentPane().add(txtMail);
		txtMail.setColumns(10);
		txtMail.setVisible(false);


		txtdure = new JTextField();
		txtdure.setText("Dure de la formation (en H)");
		txtdure.getText();
		frame.getContentPane().add(txtdure);
		txtdure.setColumns(10);
		txtdure.setVisible(false);

		txtdureec = new JTextField();
		txtdureec .setText("Duré totale au centre (en %)");
		txtdureec .getText();
		frame.getContentPane().add(txtdureec );
		txtdureec .setColumns(10);
		txtdureec .setVisible(false);

		txtacuelle = new JTextField();
		txtacuelle.setText("Avancement de la formation");
		txtacuelle.getText();
		frame.getContentPane().add(txtacuelle);
		txtacuelle.setColumns(10);
		txtacuelle.setVisible(false);

		txtdip = new JTextField();
		txtdip.setText("Diplome ");
		txtdip.getText();
		frame.getContentPane().add(txtdip);
		txtdip.setColumns(10);
		txtdip.setVisible(false);

		txtNomEntreprise = new JTextField();
		txtNomEntreprise.setText("Nom de l'entreprise ");
		txtNomEntreprise.getText();
		frame.getContentPane().add(txtNomEntreprise);
		txtNomEntreprise.setColumns(10);
		txtNomEntreprise.setVisible(false);

		btnNewButton = new JButton("Valider");
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnNewButton.setVisible(false);



	}

	public JTextField getTxtPrenom() {
		return txtPrenom;
	}

	public void setTxtPrenom(JTextField txtPrenom) {
		this.txtPrenom = txtPrenom;
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		//
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		visibleadd(e, null);
	}

	public void visibleadd(EventObject e, JMenuItem mntmNewMenuItem_2)
	{
		if (((AbstractButton)e.getSource()).getText().equals("ADD"))
		{
			frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
			affJlistoff();
			//System.out.println(j);
			visibleaddall();

		}
		else if (((AbstractButton)e.getSource()).getText().equals("JAVA"))
		{
			GridBagLayout grid = new GridBagLayout();
			frame.setLayout(grid);
			visibleaddallfal();
			affJlist();	
		}
		else if (((AbstractButton)e.getSource()).getName() == "Promotion")
		{
			visiblepopup();
		}
		else if (((AbstractButton)e.getSource()).getText().equals("Valider"))
		{
			System.out.println(txtpromotion);
			Apprenants ap = new Apprenants(txtNom, txtPrenom, txtSalaire, txtSalaire,  txtMail, txtNomEntreprise, txtDateDinscription,txtTypeDeContrat);
			Promotion  pr = new Promotion(txtpromotion, txtdure, txtdureec,txtacuelle);

			addinfo(ap);
			addinofpro(pr, 0, 0, 0);

			if(txtpromotion.equals("JAVA"))
			{
				String o = "ghfjdklsmldkfjgnb";
			}
		}
	}

	public void addinfo(Apprenants ap)
	{
		ap.nom = txtNom.getText();
		ap.prenom = txtPrenom.getText();
		ap.salaire = txtSalaire.getText();
		ap.date_inscription = txtDateDinscription.getText();
		ap.typeContrat = txtTypeDeContrat.getText();
		ap.telephone = txtTlphone.getText();
		ap.mail = txtMail.getText();
		ap.nom_entreprise = txtNomEntreprise.getText();
	}

	public void addinofpro(Promotion pr, int a , int b , int c)
	{
		System.out.println(txtpromotion);
		pr.nomPromotion = txtpromotion;
		pr.dureeTotalFormation = txtdure.getText();
		pr.dureeTotalCentre = txtdureec.getText();
		pr.dureeRealise = txtacuelle.getText();
		pr.promoDiplomante = txtdip.getText();
	}

	public void visibleaddall()
	{
		txtNom.setVisible(true);
		button.setVisible(true);
		txtPrenom.setVisible(true);
		txtSalaire.setVisible(true);
		txtMail.setVisible(true);
		txtDateDinscription.setVisible(true);
		txtTypeDeContrat.setVisible(true);
		txtNomEntreprise.setVisible(true);
		txtTlphone.setVisible(true);
		txtdure.setVisible(true);
		txtdureec .setVisible(true);
		txtacuelle.setVisible(true);
		txtdip.setVisible(true);
		btnNewButton.setVisible(true);
	}

	public void visibleaddallfal()
	{
		txtdure.setVisible(false);
		txtdureec .setVisible(false);
		txtacuelle.setVisible(false);
		button.setVisible(false);
		txtdip.setVisible(false);
		btnNewButton.setVisible(false);
		txtMail.setVisible(false);
		txtNomEntreprise.setVisible(false);
		txtNom.setVisible(false);
		button.setVisible(false);
		txtPrenom.setVisible(false);
		txtSalaire.setVisible(false);
		txtDateDinscription.setVisible(false);
		txtTypeDeContrat.setVisible(false);
		txtTlphone.setVisible(false);
		txtNomEntreprise.setVisible(false);
		btnNewButton.setVisible(false);
	}

	public String visiblepopup()
	{
		JFrame jFrame = new JFrame("Choisir la promo");


		jFrame.setBounds(500, 300, 400, 150);

		JPanel panel = new JPanel();
		JPanel panelLabel = new JPanel();
		JLabel jLabel = new JLabel("Press close button to close the dialog.");
		panelLabel.add(jLabel);
		ButtonGroup bg = new ButtonGroup();


		JRadioButton j = new JRadioButton("JAVA");
		j.setActionCommand("JAVA");
		panel.add(j);
		bg.add(j);


		JRadioButton p = new JRadioButton("PHP");
		p.setActionCommand("PHP");
		panel.add(p);
		bg.add(p);


		JRadioButton c = new JRadioButton("C");
		c.setActionCommand("C");
		panel.add(c);
		bg.add(c);


		JRadioButton s = new JRadioButton("SQL");
		s.setActionCommand("SQL");
		panel.add(s);
		bg.add(s);


		JRadioButton py = new JRadioButton("PYTHON");
		py.setActionCommand("PYTHON");
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
				String a =  bg.getSelection().getActionCommand();

				if (a.equals("JAVA"))
				{
					button.setText(bg.getSelection().getActionCommand());
					txtpromotion = "JAVA";

				}
				else if (a.equals("PHP"))
				{
					button.setText(bg.getSelection().getActionCommand());
					txtpromotion = "PHP";

				}
				else if (a.equals("C"))
				{
					button.setText(bg.getSelection().getActionCommand());
					txtpromotion = "C";

				}
				else if (a.equals("SQL"))
				{
					button.setText(bg.getSelection().getActionCommand());
					txtpromotion = "SQL";

				}
				else if(a.equals("PYTHON"))
				{
					button.setText(bg.getSelection().getActionCommand());
					txtpromotion = "PYTHON";
				}
				jFrame.dispose();

			}
		});
		return txtpromotion;

	}

	public void affJlist()
	{
		JFrame frame = new JFrame();
        Apprenants fly = new Apprenants(txtNom, txtPrenom, txtDateDinscription, txtTypeDeContrat, txtNomEntreprise, txtdureec, txtdure, txtacuelle);
        DefaultListModel<Apprenants> demoList = new DefaultListModel<>();
        demoList.addElement(fly);
        JList<Apprenants> list = new JList<>(demoList);
        Apprenants fly2 = new Apprenants(textField, textField, textField, textField, textField, textField, textField, textField);
        demoList.addElement(fly2);


        // Object o = new Object();
        j.setFont(new FontUIResource(j.getFont().getName(), j.getFont().getStyle(), (int)(j.getFont().getSize() * 1.7)));
        j.setPreferredSize(new Dimension(200, 250));
        JPanel panel = new JPanel();
        frame.setBounds(600, 400, 250, 250);

        JScrollPane scroller = new JScrollPane(j);

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        j.setVisibleRowCount(7);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
	}

	public void affJlistoff()
	{
		j.setVisible(false);
	}

}
