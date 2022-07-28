import java.util.Scanner;

public class ExercFor {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). 
		 * Em seguida mostre os ímpares de 1 até X, um valor por linha, 
		 * inclusive o X, se for o caso.
		 	
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor X (1 <= X <= 1000)");
		int num = input.nextInt();
		int contador = 0;
		
		if( (num >= 1) && (num <= 1000)) {
			//FOR
			for(int i = 1; i <= num; i++) {
				//MOSTRA ÍMPARES
				if(i%2 != 0) {
					System.out.println(i);
					contador++;
				}
			}			
		}else {
			System.out.println("Número inválido!");
		}		
		input.close();
		*/	
		
		
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores 
		 * inteiros X que serão lidos em seguida.
		 * 
		Mostre quantos destes valores X estão dentro do intervalo [10,20] 
		e quantos estão fora do intervalo, mostrando essas informações 
		conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" 
		para fora do intervalo).
		
		 * */
		//FILOSOFIA 2
		
		Scanner input = new Scanner(System.in);
		int n;
		int dentro = 0;
		int fora = 0;
		int numero;		
		System.out.println("Informe o número de repetições:");
		n = input.nextInt();		
		System.out.println("\nVamos repetir "+n+" vezes!\n");
		System.out.println("-------------------------------");		
		for(int i = 0; i < n; i++) {
			System.out.println(i+" - Informe um número:");
			 numero = input.nextInt();			
			if( (numero >= 10) && (numero <=20)){
				dentro++;
			}else {
				fora++;
			}
		}		
		System.out.println("---------------------------------");
		System.out.println("Dentro do intervalo: "+dentro);
		System.out.println("Fora do intervalo: "+fora);		
		input.close();
		
		
	}

}

