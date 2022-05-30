import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploChar {

	public static void main(String[] args) {

		//VERIFICA VOGAIS
		//A = 1
		//E = 2
		//I = 3
		//O = 4
		//U = 5
		
		/*char vogal;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a vogal: ");
		vogal = input.next().charAt(0);
		
		if(vogal=='A') {
			System.out.println("Primeira vogal");
		}else if(vogal=='E') {
			System.out.println("Segunda vogal");
		}else {
			System.out.println("Não existe essa vogal!");
		}*/
		
		String nome;
		
		nome = JOptionPane.showInputDialog("Informe o seu nominho:");
		
		if(nome.equalsIgnoreCase("heraldo")) {
			JOptionPane.showMessageDialog(null, "O melhor professor!");
		}else {
			JOptionPane.showMessageDialog(null, "Heraldo é melhor!");
		}
		

	}

}
