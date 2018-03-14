/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albignac & Ferrandi
 */

import java.util.ArrayList;

public class Noeud {
	private String id;
	private String latitude;
	private String longitude;
	
	public Noeud(String id,String latitude,String longitude){
		this.setId(id);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}
	
	public Noeud(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getLatitudeFromId(String Id,ArrayList<Noeud> noeuds) {
		for(int i = 0; i<noeuds.size();i++) {
			if(Integer.parseInt(Id)==Integer.parseInt(noeuds.get(i).getId())) {
				return noeuds.get(i).getLatitude();
			}
		}
		return null;
	}
	
	public String getLongitudeFromId(String Id,ArrayList<Noeud> noeuds) {
		for(int i = 0; i<noeuds.size();i++) {
			if(i==Integer.parseInt(Id)) {
				return noeuds.get(i).getLongitude();
			}
		}
		return null;
	}
	
}
