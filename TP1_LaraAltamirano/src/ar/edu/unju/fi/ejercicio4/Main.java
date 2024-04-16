package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
		long factorial = 1;
		System.out.println("Ingrese un numero :");
		
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if(num<0 || num >10) {
				System.out.println("Calcula entre numeros del 0 al 10 !");
			}
			else {
				while(num!=0) {
					factorial=factorial*num;
					num--;
				}
				System.out.println("El factorial es: "+factorial);
				scanner.close();
			}
		}
		else {
			System.out.println("Los datos ingresantes son incorrectos");
		}

	}

	}


