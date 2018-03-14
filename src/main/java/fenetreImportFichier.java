/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albignac & Ferrandi 
 */
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class fenetreImportFichier extends JFrame implements ActionListener {
	
	JButton boutonSuivant = new JButton();
	JButton boutonImport = new JButton();
	
	public fenetreImportFichier() {
		this.setTitle("Import fichier");
		this.setSize(1200, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
				
		/*Container myPanel = this.getContentPane(); 
		GroupLayout groupLayout = new GroupLayout(myPanel);
		this.setLayout(groupLayout);*/
		GridLayout grid = new GridLayout(2,2,30,30);
		this.setLayout(grid);
		
		JLabel text = new JLabel();
		text.setText("Veuillez écrire ci-dessus le chemin d'accès au fichier : ");
		this.add(text);
		
		TextField texteaRemplir = new TextField();
		texteaRemplir.setText("Chemin d'accès" );
		this.add(texteaRemplir);
		
		
		boutonImport.setText("Import");
		this.add(boutonImport);
		boutonImport.addActionListener(this);
		
		boutonSuivant.setText("Suivant");
		this.add(boutonSuivant);
		boutonSuivant.addActionListener(this);
		
		
		/*groupLayout.setHorizontalGroup(  
               	groupLayout.createSequentialGroup()  
                            .addComponent(texteaRemplir)  
                            .addGap(10, 20, 100)  
                            .addComponent(boutonImport));  
		groupLayout.setVerticalGroup(  
                 groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                            .addComponent(texteaRemplir)  
                            .addComponent(boutonImport));  
		
		*/
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		;
		
		if(e.getSource() == boutonSuivant){ //penser à valider le chemin
			this.dispose();
			fenetreMap map = new fenetreMap();
		}
		else if(e.getSource() == boutonImport){
			//lancer la méthode de récupération de fichier 
			System.out.println("test");
		}
		}
	}

