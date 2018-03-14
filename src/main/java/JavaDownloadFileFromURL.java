/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;



public class JavaDownloadFileFromURL {
	
	ArrayList<Noeud> noeuds =new ArrayList<Noeud>();
	ArrayList<Noeud> noeudRep =new ArrayList<Noeud>();

	String[] tableauReponse = new String[100];

	public JavaDownloadFileFromURL(){
	}

	
	public  void downloadUsingStream() throws IOException{
		FileInputStream file = new FileInputStream(Constants.FILE_NOEUD);
        file.close();
    }
	
	public  void readOpenDataAndSave(){
		 String[] tableauNoeud = new String[100];

		 initTableau(tableauNoeud);

		 int k=0;
		 FileReader mesNoeud = null;
		 FileReader mesReponse = null;
		try {
			 mesNoeud  = new FileReader(Constants.FILE_NOEUD);
			 mesReponse = new FileReader(Constants.FILE_REP);
			 BufferedReader tamponNoeud = new BufferedReader(mesNoeud);
			 BufferedReader tamponReponse = new BufferedReader(mesReponse);

			 String ligneNoeud = tamponNoeud.readLine();
			 String ligneReponse = tamponReponse.readLine();

			 while (true) {
					ligneNoeud = tamponNoeud.readLine();
					if (ligneNoeud == null){
						break;
					}
					Noeud newElement=new Noeud();
					convertirLigneEnTableau(ligneNoeud,tableauNoeud);
					createNoeudFromTableau(tableauNoeud,newElement);

					noeuds.add(newElement);
					initTableau(tableauNoeud);
					
				}
				
			 System.out.println(noeuds.get(4000).getLatitude());
			 System.out.println(noeuds.get(4000).getId());

			 while (true) {
				 ligneReponse = tamponReponse.readLine();
					
					if (ligneReponse == null){
						break;
					}
					initTableau(tableauReponse);
					convertirLigneEnTableau(ligneReponse,tableauReponse);
					
				}
			int i=0;
			while(tableauReponse[i]!="") {
				Noeud newElement = new Noeud();
				newElement.setId(tableauReponse[i]);

				newElement.setLatitude(noeuds.get(Integer.parseInt(newElement.getId())-1).getLatitude());
				newElement.setLongitude(noeuds.get(Integer.parseInt(newElement.getId())-1).getLongitude());

				//newElement.setLatitude(newElement.getLatitudeFromId(newElement.getId(),noeuds));
				//newElement.setLongitude(newElement.getLongitudeFromId(newElement.getId(),noeuds));
				noeudRep.add(newElement);
				//System.out.println(noeudRep.get(i).getId());
				//System.out.println(noeudRep.get(i).getLongitude());
				i++;
			}
			 

			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	 }
	
	
	public static void initTableau(String[]tab){
		for(int i=0;i<tab.length;i++){
			tab[i]="";
		}
	}
	
	public static void convertirLigneEnTableau(String line,String[] Tableau){
		int j=0;
		for(int i=0;i<line.length();i++){
			if(line.charAt(i) !=';'){
				Tableau[j]=Tableau[j]+line.charAt(i);
			}
			else{
				j++;
			}	
		}
	}
	
	public static void createNoeudFromTableau(String[]from,Noeud newElement){
		newElement.setId(from[0]);
		newElement.setLatitude(from[1]);
		newElement.setLongitude(from[2]);
	}
	

	 public ArrayList<Noeud> getNoeuds(){
			return this.noeuds;
		}
	 public ArrayList<Noeud> getReponse(){
			return this.noeudRep;
		}
}
