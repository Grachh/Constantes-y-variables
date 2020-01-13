
public class Ejemplo1 {
	static final double avogadro = 6.022E23;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  DECLARACIONES DE CONSTANTES  ------------------------------------
	/*
	 * Lo que hemos trabajado sobre tipos básicos: int, double, boolean, char, String
	 * 	Declaracion de constantes
	 *  Declaracion de variables
	 *  Uso de identificadores de constantes y variables (empiezan en minusculas)
	 *  Declaración de expresiones de tipos básicos
	 *  Literales : true, 0, 9.9, "Julio"
	 *  La asignación de variables x = 4;  usamos "="
	 *  La igualdad "=="  la desigualdad "!="
	 *  errres
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		  final double G = 9.8;
		  final boolean   cierto = true;
		  final boolean   falso = false;
		  final char       cero = '0';
		  final char          a = 'a';
		  final int  diasSemana = 7;
		  final int   añoActual = 2010;
		  final double       PI = 3.141593;

		  final String    grupo = "1O5M";
		  final String     aula = "Verdes+Monge";
		    
		//  DECLARACIONES DE PRUEBAS  ---------------------------------------

		  int           x = 8;
		  int    prueba11 = -Math.abs (6);
		  int    prueba12 = Math.abs (-6);
		  double prueba13 = Math.pow (7,2);
		  int    prueba14 = 7 % 4;
		  int    prueba15 = 7 % 1;
		  int    prueba16 = ++ x;
		  int    prueba17 = -- x;
		  
		  
		  double funciona = 9; // convierte el 9 int en 9 double
		  int no_funciona = (int) 9.4;
		  
		  
		  double prueba21 = Math.pow (7,-2);
		  double prueba22 = ++ x;
		  double prueba23 = 0.07e+2 + 70.0e-1;
		  double prueba24 = 7 / 7;
		  double prueba25 = 7.0 / 7.0;
//		  double prueba26 = (double)(7 / 7);
//		  int    prueba27 = (int)PI;
		  int    prueba28 = (int)Math.pow (7,2);
		  
		  boolean prueba31 = cierto && true;
		  boolean prueba32 = cierto || falso;
		  boolean prueba33 = cierto && ! falso;
		  boolean prueba34 = falso && cierto || falso;
		  boolean prueba35 = ! cierto && ! falso;
		  boolean prueba36 = ! (cierto && ! falso);

		  char prueba41 = cero + 1; 
		  char prueba42 = '3' - 1;
		  int  prueba43 = (int) cero; 
		  char prueba44 = (char) prueba43;
		  char prueba45 = (char) (prueba43 + 3);
		  int  prueba46 = (int) 'a';
		  int  prueba47 = (int) 'A';

		  boolean prueba51 = cierto == true;
		  boolean prueba52 = true != false;
		  boolean prueba53 = 'a' < 'A';
		  int valor_a = 'a';
		  boolean prueba54 = 'A' > a;
		  boolean prueba55 =  PI >= 3.15;
		  boolean prueba56 = (1.0 / 7.0) == (1.0 / 7.0);
		  

	//	  System.out.println(5/0);
		  System.out.println(avogadro);
		  System.out.println(cierto);
		  System.out.println(args[0]);
		  System.out.println(args[1]);

	
	}

}
