package CSM;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;

import java.awt.Button;
import javax.swing.JPopupMenu;
import java.awt.Component;
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
	private JButton button;
	private JButton btnNewButton;
	private JRadioButton chckbxNewCheckBox;
	private JTextField textField;

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
		txtNom.getText();
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		txtNom.setVisible(false);


		button = new JButton("Promotion");
		frame.getContentPane().add(button);
		// Récupère Choice
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
		else if (((AbstractButton)e.getSource()).getText().equals("Valider"))
		{
			Apprenants ap = new Apprenants(getName(), getName(), getName(), getName(), getName(), getTitle(), getWarningString(), getName(), ABORT);
			Promotion  pr = new Promotion(getWarningString(), NORMAL, ERROR, ALLBITS, ABORT, getName());
			addinfo(ap);
			addinofpro(pr, 0, 0, 0);
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
		pr.dureeTotalFormation = txtdure.getText();
		pr.dureeTotalCentre = txtdureec.getText();
		pr.dureeRealise = txtacuelle.getText();
		pr.getNbApprenants();
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

	public void visiblepopup()
	{
		JFrame jFrame = new JFrame();

		JDialog jd = new JDialog(jFrame);

		jd.getContentPane().setLayout(new FlowLayout());

		jd.setBounds(500, 300, 400, 300);

		JLabel jLabel = new JLabel("Press close button to close the dialog.");
		ButtonGroup bg = new ButtonGroup();

		chckbxNewCheckBox = new JRadioButton("JAVA");
		JRadioButton j = new JRadioButton("JAVA");
		jd.getContentPane().add(j);
		bg.add(j);

		chckbxNewCheckBox = new JRadioButton("PHP");
		JRadioButton p = new JRadioButton("PHP");
		jd.getContentPane().add(p);
		bg.add(p);

		chckbxNewCheckBox = new JRadioButton("C");
		JRadioButton c = new JRadioButton("C");
		jd.getContentPane().add(c);
		bg.add(c);

		chckbxNewCheckBox = new JRadioButton("SQL");
		JRadioButton s = new JRadioButton("SQL");
		jd.getContentPane().add(s);
		bg.add(s);

		chckbxNewCheckBox = new JRadioButton("PYTHON");
		JRadioButton py = new JRadioButton("PYTHON");
		jd.getContentPane().add(py);
		bg.add(py);

		jd.getContentPane().add(jLabel);
		jd.setVisible(true);
		jFrame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
	}

}
