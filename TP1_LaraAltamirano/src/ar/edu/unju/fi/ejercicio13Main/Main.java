package ar.edu.unju.fi.ejercicio13Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int CantEl = 8;
		int[] Array = new int[CantEl];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < CantEl ; i++ ){
			Array[i] = scanner.nextInt();
		}
		for(int i = 0 ; i < CantEl ; i++ ){
			System.out.println("En el indice " + (i+1) + " se esta almacenado el valor: " + Array[i]);
		}
		scanner.close();
	}

}