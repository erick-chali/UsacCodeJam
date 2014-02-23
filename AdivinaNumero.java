import java.util.Random;
import java.util.Scanner;


public class AdivinaNumero {
	public static int adivina;
	public static void main(String[] args) {
		System.out.println("--------Adivina El Numero--------");
		
		GenerarRandom();
	}
	private static void GenerarRandom() {
			adivina = (int)(Math.random()*100 +1);
			System.out.println("Ok, ya pense el numero, juguemos");
			IngresaNumero();
	}
	private static void IngresaNumero() {
		int n1=0;
		boolean numero;
		Scanner num = new Scanner(System.in);
		numero=false;
		while(numero==false){
			System.out.println("Adivina que numero pense. \n");
			try{
				n1 = Integer.parseInt(num.nextLine());
				ValidarAdivinanza(n1);
				numero=true;		
			}catch(NumberFormatException ime){
				System.out.println("Debes ingresar un numero \n");
				numero=false;
				n1=0;
			}
		}

	}
	private static void ValidarAdivinanza(int n1) {
		if(n1<adivina){
			System.out.println("No, el numero que pense es mayor.");
			IngresaNumero();
		}else if(n1>adivina){
			System.out.println("No, el numero que pense es menor.");
			IngresaNumero();
		}else{
			System.out.println("Ok, adivinaste, era el numero " + n1);
		}
	}
}