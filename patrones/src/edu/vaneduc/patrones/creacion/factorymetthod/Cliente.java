package edu.vaneduc.patrones.creacion.factorymetthod;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona alumno = new AlumnoFactory().create();
		Persona profesor=	new ProfesorFactory().create();
		
		System.out.println(alumno.obtenerNombre());
		System.out.println(profesor.obtenerNombre());
	}

}
