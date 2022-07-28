import java.util.Scanner;

public class testeDoWhile {

	public static void main(String[] args) {
		// 4) Crie um algoritmo que solicite alguns números inteiros e 
		//informe qual o maior e o menor deles.
		
		/*Scanner input = new Scanner(System.in);
		int maior;
		int menor;
		int num;
		
		System.out.println("Informe um número:");
		num = input.nextInt();
		maior = num;
		menor = num;
		
		while (num != -100){
			System.out.println("Informe um número:");
			num = input.nextInt();			
			if(num != -100) {
				if(num > maior) {
					maior = num;
				}else if(num < menor) {
					menor = num;
				}
			}			
		}
		
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);*/
		
		Scanner input = new Scanner(System.in);
		char sair;
		
		do {
			System.out.println("Informe a temperatura em Celcius: ");
			Double temp = input.nextDouble();
			
			Double tempFah = ((9*temp)/5)+32;
			
			System.out.println("Temperatura em Fah: "+tempFah);
			
			System.out.println("Deseja repetir: ");
			sair = input.next().charAt(0);
		} while(sair != 's');
		
	}

}
