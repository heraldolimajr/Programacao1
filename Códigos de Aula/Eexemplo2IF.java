import java.util.Scanner;

public class Exemplo2If {

	public static void main(String[] args) {
		
		//E: VERDADEIRO QD TODOS SÃO VERDADEIROS
		//OU: VERDADEIRO QD PELO MENOS 1 FOR VERDADEIRO
		//NÃO: INVERTE
		
		//SE IDADE > 65
		//SE TEMPO > 35
		
		int idade;
		int tempoDeServico;
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Informe a idade");
		idade = input.nextInt();
		
		System.out.println("Informe o tempo de serviço:");
		tempoDeServico = input.nextInt();
		
		if ((idade > 65) && (tempoDeServico > 35)) {
			System.out.println("Já pode se aposentar!");
		}else {
			System.out.println("Não pode!");
		}
		
		
		

	}

}
