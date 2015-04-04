package edu.vaneduc.patrones.creacion.builder;

import java.util.Map;

public abstract class VehicleBuilder {

	public void construct(VehicleBuilder builder){
		builder.buildFrame();
		builder.buildDoor();
		builder.buildEngine();
	}
	
	public abstract void buildFrame();
	public abstract void buildDoor();
	public abstract void buildEngine();
	public abstract String show();
	
	protected String fromMessage(Vehicle vehicle){
		StringBuffer message = new StringBuffer();
		message.append(vehicle.getType().toString());
		message.append(" Parts[");
		message.append(convertMapToString(vehicle.getParts()));
		message.append("]");
		return message.toString();
		
	}
	protected String convertMapToString(Map<String,String> value){
		StringBuffer result= new StringBuffer();
		try{
			for(Map.Entry<String,String> entry : value.entrySet()){
				result.append("{");
				result.append(entry.getKey());
				result.append("-");
				result.append(entry.getValue());
				
				result.append("}");
			}	
		}catch(Exception ex){
			System.out.println("error" + ex.getMessage());
		}
		return result.toString();
	}
}
