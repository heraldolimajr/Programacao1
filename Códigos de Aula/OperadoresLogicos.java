
public class OperadoresLogicos {

	public static void main(String[] args) {
		//c�lculo de m�dia
		double n1 = 7.13;
		double n2 = 1.12;
		double n3 = 2.43;
		
		double media = (n1+n2+n3)/3;
		// >=7 APROVADO
		// >= 4 E <7 RECUPERA��O
		// <4 REPROVADO
		
		if (media >= 7) {
			System.out.println("Aluno Aprovado!");
		}else if ((media >= 4) && (media < 7)) {
			System.out.println("Aluno em Recupera��o!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		

	}

}
