package com.ejemplo.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b;
		
		System.out.println(" Introduce a ");
		a = sc.nextDouble();
		System.out.println(" Introduce b ");
		b = sc.nextDouble();
		
		double suma = sumar (a, b);
		System.out.println(suma);
		
		double resta = restar (a, b);
		System.out.println(resta);
		
		double multiplicacion = multiplicar (a, b);
		System.out.println(multiplicacion);
		
		double division = dividir (a, b);
		System.out.println(division);
		
	}
	public static double sumar (double a, double b) {
		
		return a + b;
	}
	



	public static double restar (double a, double b) {
		
		return a - b;
}
	public static double multiplicar (double a, double b) {
	
		return a *b;
}
	public static double dividir (double a, double b) {
		if (b == 0) {
			System.out.println("No se puede dividir entre 0");
		}
		return a/b;
	}
}