package edu.vaneduc.patrones.creacion.builder;

public enum VehicleEnum {

	SCOTTER,CAR,UNKNOWN;
	
	public VehicleEnum find(String value){
		
		if(SCOTTER.toString().equals(value)){
		  	return VehicleEnum.SCOTTER;
		}
		if(CAR.toString().equals(value)){
		  	return VehicleEnum.CAR;
		}
		
		return VehicleEnum.UNKNOWN;
		
	}
}


