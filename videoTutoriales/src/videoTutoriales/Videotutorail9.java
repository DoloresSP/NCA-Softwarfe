package videoTutoriales;

import java.util.Scanner;

public class Videotutorail9 {

	
	
	
	
	public static void main(String[] args) {
		System.out.println("Como te llamas?");
		String nombre;
		Scanner lectura= new Scanner(System.in);
		nombre=lectura.nextLine();
		saludoInicial(nombre);
		
	}
public static void saludoInicial  (String nombre){
		
		System.out.println("Hola "+nombre);
		
	}
	
}

