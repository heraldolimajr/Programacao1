import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {

		//CATEGORIA FUTEBOL
		//------------------------
		// 6 - 10: Infantil
		// 11 - 14: Mirin
		// 15 - 18: Juvenil
		// 19 - 22: Adulto
		// >22: Profissional
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a idade do jogador:");
		int idade = input.nextInt();
		
		if( (idade >= 6) && (idade <= 10) ) {
			System.out.println("Categoria: INFANTIL");
		}else if ( (idade >= 11) && (idade <= 14) ) {
			System.out.println("Categoria: MIRIN");
		}else if ( (idade >= 15) && (idade <= 18) ) {
			System.out.println("Categoria: JUVENIL");
		}else if ( (idade >= 19) && (idade <= 22) ) {
			System.out.println("Categoria: ADULTO");
		}else if ((idade > 22) && (idade < 40)){
			System.out.println("Categoria: PROFISSIONAL");
		}else {
			System.out.println("Categoria: INEXISTENTE");
		}

	}

}
