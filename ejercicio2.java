package Entregable1;

import java.util.Scanner;

public class ejercicio2 {
	
	public static String alReves(String frase) { 
		String nueva = ""; /*Nueva frase al reves*/
		char a[] = frase.toCharArray();
		
		for(int i = 0; i<a.length; i++) {
			nueva = a[i] + nueva;
		}
		return nueva;
	}
	
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String frase;
		String invertida;
		
		System.out.println("Introduzca una cadena de caracteres:");
		frase = sc.nextLine();
		
		invertida = alReves(frase); /*Llamada de la funcion*/
		
		if(frase.equals(invertida)) { /*Compara las frases, debe introducirse todo junto ya que no e sabido quitar los espacios*/
			System.out.println("Es polindroma");
		}else {
			System.out.println("No es polindroma");
		}
	}
}
