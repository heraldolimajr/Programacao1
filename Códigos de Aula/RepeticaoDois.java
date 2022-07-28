import java.util.Scanner;

public class RepeticaoDois {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para ler 10 números. Todos os números lidos com valor 
		 * inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.
		 * */
		Scanner input = new Scanner(System.in);
		
		//COM WHILE
		/*
		int contador = 0;
		int soma = 0;
		
		while(contador < 10) {
			System.out.println("Informe o número:");
			int num = input.nextInt();
			
			if(num < 40) {
				soma++;
			}
			contador++;
		}*/
		
		//COM FOR
		int soma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe o número:");
			int num = input.nextInt();
			
			if(num < 40) {
				soma++;
			}
		}		
		System.out.println("Qtd de números menores que 40: "+soma);

	}

}
