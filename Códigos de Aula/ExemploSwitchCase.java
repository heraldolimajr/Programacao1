import java.util.Scanner;

public class Terceira {

	public static void main(String[] args) {
		int dia;		
		System.out.println("Informe o código do dia:");
		Scanner input = new Scanner(System.in);
		dia = input.nextInt();
		
		if(dia == 1) {
			System.out.println("Domingo");
		}else if(dia == 2) {
			System.out.println("Segunda");
		}else if(dia == 3) {
			System.out.println("Terça");
		}else if(dia == 4) {
			System.out.println("Quarta");
		}else if(dia == 5) {
			System.out.println("Quinta");
		}else if(dia == 6) {
			System.out.println("Sexta");
		}else if(dia == 7) {
			System.out.println("Sábado");
		}else {
			System.out.println("Código inválido!");
		}
		
		
		switch(dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6: 
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Código inválido!");
				
		}
	}

}
