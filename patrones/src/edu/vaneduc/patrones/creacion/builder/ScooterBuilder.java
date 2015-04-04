package edu.vaneduc.patrones.creacion.builder;


public class ScooterBuilder extends VehicleBuilder {

	private Vehicle vehicle=new Vehicle(VehicleEnum.SCOTTER);
	
	@Override
	public void buildFrame() {
		vehicle.addParts("Material","Aluminio");
		
	}

	@Override
	public void buildDoor() {
		vehicle.addParts("puerta","4");
		
	}

	@Override
	public void buildEngine() {
		vehicle.addParts("Motor","1.7");
		
	}

	@Override
	public String show() {
		return fromMessage(vehicle);
	}

	
}
