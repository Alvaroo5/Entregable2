package Entregable1;

public class ejercicio1 {
	/*
	public static int dameNumero(int[] bombo) {
		for(int i = 0; i < 99999; i++) {
			bombo[i]= (int) (Math.random()*100000);
			return bombo;
		}
	}
	
	public static String damePremio(String[] bombo) {
		
		
		
	}
	*/
	public static int[] creaBomboNumeros(int numBolas) {
		int [] bomboBolas = new int[numBolas];
		for(int i = 0; i<numBolas; i++) {
			bomboBolas[i]=i;
		}
		return bomboBolas;
	}
	
	public static String[] creaBomboPremios (int numPremios) {
		String [] bomboPremio = new String [numPremios];
		for(int i=0; i<numPremios; i++) {
			if(i==0) { 
				bomboPremio[i]="primer premio";
			}else if(i==1) {
				bomboPremio[i]="segundo premio";
			}else if(i==2) {
				bomboPremio[i]="tercero premio";
			}else if(i<5) {
				bomboPremio[i]="cuarto premio";
			}else if(i<13) {
				bomboPremio[i]="quinto premio";
			}else {
				bomboPremio[i]="pedreas";
			}
		}
		return bomboPremio;
	}
	
	
	public static void main(String[] arg) {
		int [] bolas = new int [99999];
		int [] premios = new int [1807];
		
		System.out.println("Lista oficial de premios:");
		/*
		for(int i=0; i < bolas.length; i++) {
			int numero = dameNumero();
			String premio = damePremio();
			System.out.println("Numero: "+numero+"agraciado con: "+premio);
		}
		*/
		System.out.println("Introduzca su decimo con todas sus cifras:");
		
 	}
}
