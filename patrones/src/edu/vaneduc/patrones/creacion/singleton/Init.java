package edu.vaneduc.patrones.creacion.singleton;

public class Init {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("comienzo del programa");
			Singleton single = Singleton.getInstance();
			System.out.println(single.toString());
			System.out.println("Fin");
	}

}
