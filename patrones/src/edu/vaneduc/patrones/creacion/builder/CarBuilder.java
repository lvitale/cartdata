package edu.vaneduc.patrones.creacion.builder;

public class CarBuilder extends VehicleBuilder {

	private Vehicle vehicle=new Vehicle(VehicleEnum.CAR);
	@Override
	public void buildFrame() {
		vehicle.addParts("Material","Acero");
		
	}

	@Override
	public void buildDoor() {
		vehicle.addParts("puerta","4");
		
	}

	@Override
	public void buildEngine() {
		vehicle.addParts("Motor","3.7");
		
	}

	@Override
	public String show() {
		return fromMessage(vehicle);
	}
	

}
