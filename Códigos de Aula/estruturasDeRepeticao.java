import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//questão1
		/*
		 * 
		int num = 1;
		 
		
		while ( num < 11) {
			System.out.println("Número: "+num);
			num++;
		}
		
		*/
		
		//questão2
		/*
		int i = 101;
		
		while(i < 111) {
			System.out.println("Número: "+i);
			i++;
		}
		*/
		
		//questão3
		
		/*
		int num;
		Scanner input = new Scanner(System.in);		
		System.out.println("Informe um número maiores que 1 e menores 10:");		
		num = input.nextInt();		
		if((num > 1) && (num < 10)) {
			//imprimindo a os números
			int i = 1;
			System.out.println("Número válido! imprimindo tabuada...");			
			while(i < 11 ) {
				int mult = num*i;
				System.out.println(num+" x "+i+"= "+mult);
				i++;
			}
		}else {
			System.out.println("Número inválido!");
		}
		*/
		
		//questão4
		Scanner input = new Scanner(System.in);
		int num;		
		System.out.println("Informe um número:");
		num = input.nextInt();		
		if(num > 0) {			
			int i = 1;			
			while (i < 6) {
				System.out.println(num+i);
				i++;
			}			
		}else {
			System.out.println("Número inválido!");
		}
		
		
		

	}

}
