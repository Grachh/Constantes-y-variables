class ResumenTema1
{
  // ResumenTema1 r1 = new ResumenTema1 ()
  /*
  
  
  
                        ------              T E M A    1         ------
                        
    ---            D A T O S    E L E M E N T A L E S    Y    P R I N C I P I O S     B A S I C O S       ---
                   ________________________________________________________________________________                  */
  
  
  /*
   
   DATOS EN JAVA: En Java disponemos de varios tipos de datos para representar la realidad. Existen tipos de datos 
                  basicos y tipos de datos compuestos. Los tipos de datos basicos son :
                   - int 
                   - float
                   - long
                   - double
                   - char
                   - boolean
                   
                   Estos tipos de datos representan conjuntos de objetos simples.
                   
                   Los tipos int, float, long y double representan numeros. Int representa unicamente numeros enteros, 
                   mientras que float, long y double permiten representar numeros con decimales. Double es el tipo de 
                   dato numerico que mayor rango numerico ofrece.
                   
                   Char permite representar caracteres sueltos. Una cadena de caracteres conforma un tipo de dato 
                   compuesto denominado "String".
                   
                   Boolean se utiliza para asignar valores logicos de veracidad o falsedad. 
                   
                   
-----------------------------------------------------------------------------------------------------------------------
  DECLARACION DE VARIABLES Y CONSTANTES: Para operar en Java, son necesarias las variables y las constantes. El valor
                                         de una variable puede ser modificado en un proceso X, mientras que el de una
                                         constante se mantiene inmutable. 
                                         
                                         Para declarar una variable, hemos de escribir:
                                         <<TipoElementos>> "identificador" = <<Valor>>;
                                         El identificador ha de empezar por minuscula.
                                         El ";" es muy importante. Sin él, no hemos concluido la declaracion.
                                         
                                         Para declarar una constante, haremos lo mismo que antes, añadiendo el termino
                                         " final " a la izquierda del todo de la declaracion.                       */
  // Ejemplos
  
  final int altura = 180; //centimetros. Lo indicamos como constante porque decidimos que su altura no cambiara nunca.
 /*  EJEMPLO DE ERROR AL INTENTAR MODIFICAR UNA CONSTANTE
> final int altura = 180;
> altura
180
> altura =12;
Static Error: Variable 'altura' cannot be modified
  */
  
  double peso = 87.5; //Kilogramos
  
  char inicial = 'J';
  boolean esRubio = false;
  boolean esMoreno = true;
  
  /*
-----------------------------------------------------------------------------------------------------------------------
                ----          T I P O        I N T       ----                                                        
  
 Como ya hemos dicho, representan numeros enteros. Los operadores asociados a este tipo de datos son:
   +  Suma, signo positivo
   -  Resta, signo negativo
   %  Resto de la Division . El operador de la derecha ha de ser > 0
   /  Cociente de la division                
   *  Producto
                                                                                                                     */
  int i1 = 2;
  int i2 = 3;
  int i3 = 5;
  
  int operacion = (((i1 + i2 + i3) / (i3)) * i2) % i3;
  
  
  
/*---------------------------------------------------------------------------------------------------------------------
                          ----          T I P O        D O U B L E       ----                                                        
  
 Como ya hemos dicho, representan numeros reales. Los operadores asociados a este tipo de datos son:
   +  Suma, signo positivo
   -  Resta, signo negativo
   /  Cociente de la division                
   *  Producto
   
   NOTACION CIENTIFICA: para notar cientificamente un numero escribiremos la base, "E" , y el exponente.             */
  
  
  double d1 = 0.5;
  double d2 = 0.3;
  double d3 = 9.7654;
  
  double notCientifica = 2E4; // 2 * (10 ^ 4)
  double operacionD = ((d1 + d2 - d3) / notCientifica); // Devuelve un exponencial, obviamente.
  
  
  
/*---------------------------------------------------------------------------------------------------------------------
                          ----          T I P O        C H A R        ----                                          
   
  
  Java utiliza el lenguaje UNICODE Representan caracteres. Las variables pueden ser de tipo alfanumerico, o secuencias 
  de escape.
  Secuencias de escape:
     '\n'  salto de línea
     '\f'  salto de página
     '\t'  tabulador
     '\b'  backspace
     '\r'  retorno de carro
  Operadores:
     Los mismos que para datos de tipo " int "                                                                     */
  
  
  char euro = '€';
  char dolar = '$';
  char cero = '0';
  char tres = '3';
  

/*---------------------------------------------------------------------------------------------------------------------
                          ----          T I P O      B O O L E A N      ----                              
                          
  Agrupa los valores logicos booleanos "true" y "false", es decir veracidad y falsedad. Los operadores asociados son:
    !   Negacion
    &&  Conjuncion
    ||  Disyuncion
                                                                                                                     */
  boolean noche = true; // Suponemos que es de noche
  boolean dia = !noche; // Si es de noche, no es de dia, es decir, dia es la negacion de noche.
  boolean claroscuro = noche && dia ; // Un claroscuro es cuando hay noche y dia a la vez. Una situacion imposible
  boolean diaNormal = noche || dia; // Un dia normal es q sea o bien de dia o bien de noche. To2 los dias son normales.
  
  
  
/*---------------------------------------------------------------------------------------------------------------------
                   ----         O P E R A D O R E S    D E    C O M P A R A C I O N      ----                        
  
  Existen ciertos elementos que permiten comparar tipos de datos. Estos son:
    
    ==  Igual que
    !=  Desigual que
    <   Menor que
    <=  Menor o igual que
    >   Mayor que
    >=  Mayor o igual que
    
    Los operandos pueden ser:
     int / double / char para cualquiera de ellos
     boolean unicamente para igual o desigual
     
    El resultado de una comparacion SIEMPRE es boolean                                                               */
  
  int a = 1;
  int b = 3;
  
  boolean mayor = a < b; //Es mayor b que a ---> True
  boolean iguales = a ==b;// 1 y 3 no son iguales ----> False
  boolean desiguales = a != b;// 1 y 3 son desiguales -----> True
  
    
  
  
/*---------------------------------------------------------------------------------------------------------------------
                         ----         C L A S E     S T R I N G      ----         
  
  Es un tipo de datos complejo. Se trata de una cadena de caracteres. Los elementos de un String estan entre comillas 
   ""
   
   Existe el operador + que permite ir añadiendo Strings.
   Al declarar un String, ya que es una CLASE, su tipo de datos empieza por mayuscula.                             */

  String s1 = " Este ";
  String s2 = " es el ";
  String s3 = " resumen ";
  String s4 = " del tema ";
  String s5 = " '' Datos Elementales y Principios Basicos '' ";
  
  String titulo = s1 + s2 + s3 + s4 + s5;
   
   
  /*

> titulo
" Este  es el  resumen  del tema  '' Datos Elementales y Principios Basicos '' "

*/
  
  
/*---------------------------------------------------------------------------------------------------------------------
                         ----         C O N V E R S I O N     D E     T I P O S      ----       
                         
  En el caso de los numeros, si queremos sumar numeros de tipo int y tipo double, el resultado seria de tipo double,
  ya que abarca a los numeros de tipo int. Esto seria una conversion automatica.
  
  Si queremos forzar una conversion a un tipo deseado, basta con indicar con el tipo de datos a convertir entre
  parentesis antes de la operacion.                                                                                 */
  
  
  char numerin2 = '3';
  int num = 5;
  double pi = 3.14;
  
  int tresConvertido = (int) numerin2;
  double tresConvertido2 = (double) numerin2;
  int piConvertido = (int) pi;
  double numConvertido = (double) num;
 
  
  
  /*
   
> tresConvertido
51
> tresConvertido2        Tanto tresConvertido y tresConvertido2 dan 51 porque el valor de 3 en ASCII es 51
51.0
> piConvertido
3
> numConvertido
5.0



  
  
  
  
  
  
  ------------------------------------------------- F I N A L ---------------------------------------------------------
  
  */
  
}
                   
                   
                   