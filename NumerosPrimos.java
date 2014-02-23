import java.util.Scanner;


public class NumerosPrimos {
	public static int limite;
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--------Numeros Primos--------");
		PedirNumero();
	}
	private static void PedirNumero() {
		System.out.println("Ingresa un numero.");
		try{
			limite=Integer.parseInt(scan.nextLine());
			CalcularPrimos(limite);
		}catch(NumberFormatException e){
			System.out.println("Debes ingresar un numero.");
			PedirNumero();
		}
	}
	private static void CalcularPrimos(int limite) {
		int cont=0;
		System.out.println("Los numeros primos del 1 al " + limite + " son:");
		for(int x=0;x<=limite;x++){
			cont=0;
			for(int y=1;y<=x;y++){
				if((x%y)==0){
					cont++;
				}
			}

			if(cont==2){
				System.out.println(x);
			}
		}
	}

}
