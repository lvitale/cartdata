package edu.vaneduc.patrones.creacion.factorymetthod;

public class ProfesorFactory extends PersonaFactory {

	public Persona create() {
		return new Profesor();
	}

}
