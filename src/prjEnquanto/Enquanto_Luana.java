package prjEnquanto;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número maior que zero e maior que cem: ");
		num = entrada.nextInt();
		while(num<0) {	
			for(c=num;c<=100;c++) {
				if(c%2==1) {
					System.out.print(c+" ,");
			}
		}
		System.out.println(" ");
		System.out.println("Digite um número de 0 a 100");
		num = entrada.nextInt();
		if (num<0) {
			System.out.println("Programa finalizado");
		}
		
		}
	}
}