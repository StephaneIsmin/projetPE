/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albignac & Ferrandi
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class fenetreMap extends JFrame implements ActionListener{
	
	
	JButton boutonRetour = new JButton();  
	JButton boutonSuivant = new JButton();
	JPanel panneauSud = new JPanel();
	
	
	
	public fenetreMap() {
		this.setTitle("Map !");
		//this.setSize(1200, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setLayout(new BorderLayout());
	
		JLabel lab = new JLabel(new ImageIcon("jesuislacarte.jpg"));
		this.getContentPane().add(lab, BorderLayout.CENTER);
		
		boutonSuivant.setText("Suivant");
		boutonSuivant.addActionListener(this);
		boutonRetour.setText("Retour");
		
		
		this.getContentPane().add(panneauSud, BorderLayout.SOUTH);
		
	
		panneauSud.add(boutonRetour);
		panneauSud.add(boutonSuivant);
		
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == boutonSuivant){
			System.out.println("faire les paramètres et la page stat !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}
