/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albignac & Ferrandi
 */

public class Couple {
	private String noeudX;
	private String noeudY;
	private String distance;
	private String temps;

	
	public Couple(String noeudX,String noeudY,String distance,String temps){
		this.noeudX=noeudX;
		this.noeudY=noeudY;
		this.distance=distance;
		this.temps=temps;
	}
	
	public Couple(){
		
	}

	public String getNoeudX() {
		return noeudX;
	}

	public void setNoeudX(String noeudX) {
		this.noeudX = noeudX;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getNoeudY() {
		return noeudY;
	}

	public void setNoeudY(String noeudY) {
		this.noeudY = noeudY;
	}

	public String getTemps() {
		return temps;
	}

	public void setTemps(String temps) {
		this.temps = temps;
	}
}
