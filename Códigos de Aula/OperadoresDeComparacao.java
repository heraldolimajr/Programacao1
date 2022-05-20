
public class OperadoresDeComparacao {

	public static void main(String[] args) {

		int a = 4;
		int b = 2;
		int c = 20;
		int d = 50;
		
		//E
		System.out.println( (a>b) && (c>d) );
		
		//OU
		System.out.println( (a>b) || (c>d) );
		
		System.out.println("--------------------------");
		//NÃO
		
		System.out.println( (a>b) );
		System.out.println( !(a>b) );

	}

}
