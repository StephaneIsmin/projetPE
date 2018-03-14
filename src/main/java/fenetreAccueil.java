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

public class fenetreAccueil extends JFrame implements ActionListener{

	public fenetreAccueil() {
		this.setTitle("Bienvenue dans l'outil d'optimisation au transport AixRoading !");
		this.setSize(1200, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		
		this.setLayout(new BorderLayout());
		
		JButton boutonAccueil = new JButton();
		boutonAccueil.setText("Suivant");
		boutonAccueil.addActionListener(this);
		this.getContentPane().add(boutonAccueil, BorderLayout.SOUTH);
		
		JLabel lab = new JLabel(new ImageIcon("routeOptimization.jpg"));
		this.getContentPane().add(lab, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
		
}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();
		fenetreImportFichier fenetrefichier = new fenetreImportFichier();
		
	}
}
