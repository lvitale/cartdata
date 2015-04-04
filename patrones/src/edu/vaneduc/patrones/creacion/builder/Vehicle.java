package edu.vaneduc.patrones.creacion.builder;

import java.util.HashMap;
import java.util.Map;

public class Vehicle {

	private VehicleEnum type;
	
	private Map<String,String> parts = new HashMap<String,String>();
	
	public Vehicle(VehicleEnum type){
		this.type=type;
	}

	public Map<String, String> getParts() {
		return parts;
	}

	public void setParts(Map<String, String> parts) {
		this.parts = parts;
	}
	public VehicleEnum getType() {
		return type;
	}

	public void setType(VehicleEnum type) {
		this.type = type;
	}
	public void addParts(String key,String value){
		parts.put(key, value);
	}

}
