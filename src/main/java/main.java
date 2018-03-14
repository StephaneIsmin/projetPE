/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albignac & Ferrandi 
 */

import java.io.IOException;
import java.util.ArrayList;

public class main {
	ArrayList<Noeud> noeuds =new ArrayList<Noeud>();
	ArrayList<Noeud> noeudRep =new ArrayList<Noeud>();

	main(){
		System.out.println("début");
		System.out.println("lecture du fichier");
		JavaDownloadFileFromURL  newFile= new JavaDownloadFileFromURL();
		newFile.readOpenDataAndSave();
		this.noeuds=newFile.getNoeuds();
		this.noeudRep=newFile.getReponse();

		
		System.out.println(noeudRep.get(0).getId());
		System.out.println(noeudRep.get(0).getLatitude());
		System.out.println(noeudRep.get(9).getId());
		System.out.println(noeudRep.get(9).getLongitude());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
                fenetreAccueil fenetre1 = new fenetreAccueil();
	}
}
