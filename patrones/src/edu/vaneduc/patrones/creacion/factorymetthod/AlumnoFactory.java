package edu.vaneduc.patrones.creacion.factorymetthod;

public class AlumnoFactory extends PersonaFactory {

	public Persona create() {
		return new Alumno();
	}

}
