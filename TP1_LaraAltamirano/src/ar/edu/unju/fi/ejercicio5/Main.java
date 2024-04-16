package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        int prod,multi;
		
		System.out.println("Ingrese un numero entre el 1 al 9: ");
		
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNextInt()) {
			int num1 = scanner.nextInt();
			if(num1<1 || num1 > 9) {
				System.out.println("Solamente calcula numeros del 1 al 9.");
			}
			else {
				for(multi = 0; multi < 11; multi++) {
					prod = num1 *multi;
					System.out.println(num1 +" x "+ multi + " = " + prod);
					
					}
				 }
			
				scanner.close();
			}
			else {
			System.out.println("Se ingreso datos incorrectos");
		}

	}

}
