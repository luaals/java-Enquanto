package PctExercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
		 int x=0;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe um número: ");
			num = entrada.nextInt();
			
			if (num>100)
				System.out.println("Esse número é maior que 100. ");
			else
				while (num%2==1) 
					  num++;
					  x += num;
	}

}
