
public class OperadoresLogicos {

	public static void main(String[] args) {
		//cálculo de média
		double n1 = 7.13;
		double n2 = 1.12;
		double n3 = 2.43;
		
		double media = (n1+n2+n3)/3;
		// >=7 APROVADO
		// >= 4 E <7 RECUPERAÇÃO
		// <4 REPROVADO
		
		if (media >= 7) {
			System.out.println("Aluno Aprovado!");
		}else if ((media >= 4) && (media < 7)) {
			System.out.println("Aluno em Recuperação!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		

	}

}
