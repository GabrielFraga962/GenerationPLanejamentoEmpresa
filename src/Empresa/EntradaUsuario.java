package empresa;

import java.util.Scanner;

public class EntradaUsuario {
	private static Scanner leitura = new Scanner(System.in);
	
	//leitura de dados, observando que o tratamento com try catch tem que ser feito na classe chamadora 
	public static float getFloat() {
		return Float.parseFloat(EntradaUsuario.leitura.nextLine());
		
	}
	public static  int getInt() {
		return Integer.parseInt(EntradaUsuario.leitura.nextLine());
		
	}
	
	public static String getString() {
		return leitura.nextLine();
	}
}
