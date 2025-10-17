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
		
	}
	public static double sumar (double a, double b) {
		
		return a + b;
	}

}
