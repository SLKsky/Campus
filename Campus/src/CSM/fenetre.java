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
	private JRadioButton chckbxNewCheckBox;

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
//
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
		JFrame jFrame = new JFrame();

		JDialog jd = new JDialog(jFrame);

		jd.setLayout(new FlowLayout());

		jd.setBounds(500, 300, 400, 300);

		JLabel jLabel = new JLabel("Press close button to close the dialog.");
		ButtonGroup bg = new ButtonGroup();

		chckbxNewCheckBox = new JRadioButton("JAVA");
		JRadioButton j = new JRadioButton("JAVA");
		jd.add(j);
		bg.add(j);


		chckbxNewCheckBox = new JRadioButton("PHP");
		JRadioButton p = new JRadioButton("PHP");
		jd.add(p);
		bg.add(p);

		chckbxNewCheckBox = new JRadioButton("C");
		JRadioButton c = new JRadioButton("C");
		jd.add(c);
		bg.add(c);

		chckbxNewCheckBox = new JRadioButton("SQL");
		JRadioButton s = new JRadioButton("SQL");
		jd.add(s);
		bg.add(s);

		chckbxNewCheckBox = new JRadioButton("PYTHON");
		JRadioButton py = new JRadioButton("PYTHON");
		jd.add(py);
		bg.add(py);

		//TODO
		//	        jButton.addActionListener(new ActionListener() {
		//	            @Override
		//	            public void actionPerformed(ActionEvent e) {
		//	                jd.setVisible(false);
		//	            }
		//	        });

		jd.add(jLabel);
		jd.setVisible(true);
		jFrame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
	}

}
