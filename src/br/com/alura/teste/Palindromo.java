package br.com.alura.teste;

import java.util.Scanner;

public class Palindromo {
	
	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
int t = s.nextInt();
s.nextLine();
for(int i = 1; i <= t; i++) {
System.out.println(i + "\"");
String p = s.nextLine();
if(new StringBuilder(p).reverse().toString().equals(p))
	System.out.println("YES\"");
 else 
	System.out.println("NO\"");
			
}
}
	
}


