package videoTutoriales;
import java.util.Scanner;
public class Videotutorialprueba {

	
	
	public static void main(String[] args){
    System.out.println("inserte un numero");
		int limite;
		Scanner leer= new Scanner (System.in);
		limite=leer.nextInt();
		int [] lista= new int [limite];
		 for(int i=0;i<limite;i++){
			 lista[i]=10*i;
			 System.out.print(lista[i]+" ");
		 }
		
		int longitud = lista.length;
System.out.println(longitud);
	}
}
