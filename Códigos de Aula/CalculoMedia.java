import java.util.Locale;
import java.util.Scanner;

public class Qst1 {

	public static void main(String[] args) {
		// LEIA 3 NOTAS
		// CALCULE M�DIA
		//IMPRIMA NA TELA COM DUAS CASAS DECIMAIS
		
		//declara��o de vari�veis
		double n1, n2, n3, media;
		
		System.out.println("<3 C�LCULO DE M�DIA <3");
		
		//For�ar a usar o .(ponto)
		Locale.setDefault(Locale.US);
		
		//criei o objeto de entrada
		Scanner entrada = new Scanner(System.in);
		
		//solicito a primeira nota
		System.out.println("Informe a n1:");
		n1 = entrada.nextDouble();
		
		//solicito a nota 2
		System.out.println("Informe a n2:");
		n2 = entrada.nextDouble();
		
		//solicito a nota 3
		System.out.println("Informe a n3:");
		n3 = entrada.nextDouble();
		
		//calcula a m�dia
		media = n1+n2+n3/3;
		
		//imprime o resultado
		System.out.printf("A m�dia �: %.1f",media);		
		
		

	}

}
