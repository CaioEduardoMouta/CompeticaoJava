package br.com.alura.teste;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
		
			int numero = scanner.nextInt();
			if(numero == 42) break;
			System.out.println(numero);
			
		}
		
	}

}
