package CSM;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Button;

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
	private Button button;

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
		
		button = new Button("Promotion");
		frame.getContentPane().add(button);
		
		txtPrenom = new JTextField();
		txtPrenom.setText("Prenom");
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtSalaire = new JTextField();
		txtSalaire.setText("Salaire");
		frame.getContentPane().add(txtSalaire);
		txtSalaire.setColumns(10);
		
		txtDateDinscription = new JTextField();
		txtDateDinscription.setText("Date d'inscription");
		frame.getContentPane().add(txtDateDinscription);
		txtDateDinscription.setColumns(10);
		
		txtTypeDeContrat = new JTextField();
		txtTypeDeContrat.setText("Type de contrat");
		frame.getContentPane().add(txtTypeDeContrat);
		txtTypeDeContrat.setColumns(10);
		
		txtTlphone = new JTextField();
		txtTlphone.setText("Téléphone");
		frame.getContentPane().add(txtTlphone);
		txtTlphone.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setText("Mail");
		frame.getContentPane().add(txtMail);
		txtMail.setColumns(10);
		
		txtNomEntreprise = new JTextField();
		txtNomEntreprise.setText("Nom Entreprise");
		frame.getContentPane().add(txtNomEntreprise);
		txtNomEntreprise.setColumns(10);
		
		JButton btnNewButton = new JButton("Valide");
		frame.getContentPane().add(btnNewButton);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		//
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
