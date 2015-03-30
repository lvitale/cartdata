package edu.vaneduc.patrones.creacion.singleton;

public class Singleton {

	private static final Singleton instance= new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance(){
		return instance;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Patron singleton"; 
	}
}
