// AUTOR: Javier Galve
// GRUPO: 
//
//Función interes.
//Función sueldoBruto.    
//Función impuesto.    
//Función sueldoNeto.             
//Función nivelAlerta.
//Función comprobacionIntento.  
//Función comprobacionIntento3.  
//Función codigoDeCalificacion (enunciada en clase).

//PAUTAS: 
//- Intenta hacer la definición de las funciones
//  utilizando otras funciones ya hechas anteriormente.
//  Para ello, lee atentamente los ejemplos.
//- Completa los pasos de DEFINICIÓN y PRUEBAS.
//- Añade el método main con todo lo necesario para 
//  poder ejecutar las pruebas. 
//- Elige una de las funciones hechas y añade todo lo 
//  necesario en el main para poder leer sus datos del teclado.

class UE04_Entrega1{
  
//Función interes.
//Calcula la cantidad de interés en euros que produce 
//una cantidad de dinero en un año invertido en un banco que 
//da un 4% para depósitos de hasta 1000€, un 4.5% anual para 
//depósitos de hasta 5000€, y un 5% para más de 5000€.  
//PAUTA: Utiliza la función tasaDeInteres().

  //PRE: n >= 0
  //POST: Determina la cantidad de interés en euros que da 
  // la cantidad de n euros a partir de la tasaDeInteres().
  //EJEMPLOS:     
  //  =PARA HACER=
  //PLANTILLA:
  //  ... n ...
  double interes(double n){
    //  =PARA HACER=
    return 0;
  }

  
//Función sueldoBruto.    
//Calcular el sueldo bruto total de un empleado que trabaja 
//por horas a partir del número de horas trabajadas. El 
//salario por hora viene definido en euros por una constante.

  double SALARIO_HORA = 15; //Salario por hora en euros.

  //PRE: h >= 0
  //POST: Calcula el sueldo bruto de un empleado que ha trabajado 
  //h horas con un salario por hora definido en euros por la 
  //constante SALARIO_HORA.
  //EJEMPLOS:
  //  sueldoBruto(40) = 40*15 = 600
  //  sueldoBruto(6) = 6*15 = 90
  //  sueldoBruto(0) = 0
  //PLANTILLA:
  //  ... sueldoBruto ... 
  double sueldoBruto(double h){
    //  =PARA HACER=
    return 0;
  }
  //PRUEBAS:
  boolean prueba1SueldoBruto(){
    return sueldoBruto(40)==600;
  }
  boolean prueba2SueldoBruto(){
    return sueldoBruto(6)==90;
  }
  boolean prueba3SueldoBruto(){
    return sueldoBruto(0)==0;
  }
  boolean pruebaSueldoBruto(){
    //  =PARA HACER=
    return false;
  }
  
//Función impuesto.    
//Dado el sueldo bruto, calcula la cantidad de impuestos a pagar.
//Para un sueldo bruto de 600€ o menos, los impuestos son del 0%;
//para entre más de 600€ y hasta 1000€, los impuestos son del 15% 
//y para sueldos por encima de 1000€, la tasa de impuestos es del 28%.

  //PRE: sueldo >= 0
  //POST: Calcula los impuestos a pagar para un sueldo bruto 
  //"sueldo" según la siguiente tabla: 
  //   sueldo <= 600€         --> 0%
  //   600€ < sueldo <= 1000€ --> 15%
  //   1000€ < sueldo         --> 28%
  //EJEMPLOS:
  //  =PARA HACER=
  //PLANTILLA:
  //    if (sueldo<=600)
  //      ...
  //    else if (sueldo<=1000) 
  //      ...
  //    else if (sueldo>1000) 
  //      ...
  double impuesto(double sueldo){
  //  =PARA HACER=
    return 0.0;
  }
  //PRUEBAS:
  //  =PARA HACER=

//Función sueldoNeto.    
//La función determina el sueldo neto de un empleado a partir del 
//sueldo bruto. El sueldo neto de un empleado es el 
//sueldo bruto menos los impuestos (establecidos en la función 
//"impuesto").

  //PRE: sueldoBruto >= 0
  //POST: Calcula el sueldo neto de un empleado a partir del 
  //sueldo bruto descontando los impuestos establecidos en impuesto().
  //EJEMPLOS:
  //  sueldoNeto(100) = 100-100*impuesto(100) = 100-0 = 100
  //  sueldoNeto(600) = 600-600*impuesto(600) = 600-0 = 600
  //  sueldoNeto(800) = 800-800*impuesto(800) = 800-800*0.15 = 680
  //  sueldoNeto(1000) = 1000-1000*impuesto(1000) = 1000-1000*0.15 = 850
  //  sueldoNeto(2000) = 2000-2000*impuesto(2000) = 2000-2000*0.28 = 1440
  //PLANTILLA:
  //  ... sueldoBruto ... 
  double sueldoNeto(double sueldoBruto){
    //  =PARA HACER=
    return 0.0;  
  }
  //PRUEBAS:
  //  =PARA HACER=


//Función nivelAlerta.
//Desarrollar una función nivelAlerta que reciba la velocidad 
//del viento (en km/h) y devuelva el nivel de alerta según la 
//siguiente tabla:           
//            V del viento (km/h)            Nivel de alerta
//                 0-24                            Verde
//                 25-60                          Amarillo
//                  >60                             Rojo  
  
  enum NivelAlerta {VERDE, AMARILLO, ROJO};
  
  //PRE: v>=0
  //POST: Calcula el nivel de alerta para una velocidad
  //del viento v medida en km/h.
  //   v <= 24      --> VERDE
  //   24 < v <= 60 --> AMARILLO
  //   60 < v       --> ROJO
  //EJEMPLOS:
  //  =PARA HACER=
  //PLANTILLA:
  //  if (0<=v && v<=24)
  //    ...
  //  else if (24<v && v<=60)
  //    ...
  //  else if (60<v) 
  //    ...
  NivelAlerta nivelAlerta(int v){
    //  =PARA HACER=
    return NivelAlerta.VERDE;
  }
  //PRUEBAS:
  //  =PARA HACER=

  
//Función comprobacionIntento.  
//Recibe dos números: intento y objetivo. Dependiendo de cómo 
//intento se relaciona con objetivo, la función devuelve una 
//de las tres respuestas siguientes: DEMASIADO_PEQUEÑO, PERFECTO, 
//o DEMASIADO_GRANDE. Da una definición de tipo enumerado para 
//la respuesta. 
  
  enum Respuesta {DEMASIADO_PEQUEÑO, PERFECTO, DEMASIADO_GRANDE};
  
  //PRE: Cierto
  //POST: Compara intento con objetivo y devuelve el valor
  //adecuado de los definidos en el tipo Respuesta.
  //EJEMPLOS:
  //  comprobacionIntento(1, 2) = DEMASIADO_PEQUEÑO
  //  comprobacionIntento(1, 1) = PERFECTO 
  //  comprobacionIntento(1, 0) = DEMASIADO_GRANDE
  //PLANTILLA:
  //  if (intento<objetivo) 
  //    ...
  //  else if (intento==objetivo) 
  //    ...
  //  else if(intento>objetivo) 
  //    ...
  Respuesta comprobacionIntento(int intento, int objetivo) { 
    //  =PARA HACER=
    return Respuesta.DEMASIADO_PEQUEÑO;
  }    
  // PRUEBAS:
  //  =PARA HACER=

 
//Función comprobacionIntento3.  
//Recibe los 3 dígitos que forman el número "intento". El primer 
//dígito es el menos significativo y el tercero es el más 
//significativo. También recibe el número objetivo. Dependiendo 
//de cómo es el resultado de la comparación 
//entre intento (el número determinado por los tres dígitos) y 
//objetivo, la función devuelve una de las tres respuestas siguientes:
//DEMASIADO_PEQUEÑO, PERFECTO, o DEMASIADO_GRANDE. 
//PAUTAS: Desarrolla una función auxiliar para cada concepto. 
//Utiliza como función auxiliar la función conversion3.

  //PRE: Cierto
  //POST: Compara el número formado con los dígitos d1 (unidades), 
  //d2 (decenas) y d3 (centenas) con objetivo y devuelve el valor
  //que se especifica en comprobacionIntento().
    //EJEMPLOS:
    //       comprobacionIntento3(6, 5, 1, 156) = 
    //         comprobacionIntento(1*100 + 5*10 + 6, 156) = 
    //         comprobacionIntento(conversion3(6, 5, 1), 156) = 
    //         comprobacionIntento(156, 156) = 
    //         PERFECTO
    //       comprobacionIntento3(1, 0, 0, 2) =
    //         comprobacionIntento(conversion3(1, 0, 0), 2) = 
    //         comprobacionIntento(1, 2) = 
    //         DEMASIADO_PEQUEÑO
    //       comprobacionIntento3(0, 6, 2, 259) = 
    //         comprobacionIntento(conversion3(0, 6, 2), 156) = 
    //         comprobacionIntento(260, 156) = 
    //         DEMASIADO_GRANDE
    //PLANTILLA:
    // ... d1 ... d2 ... d3 ... objetivo
  Respuesta comprobacionIntento3 (int d1, int d2, int d3, int objetivo) { 
    //  =PARA HACER=
    return Respuesta.DEMASIADO_PEQUEÑO;
  }    
  //PRUEBAS:
  //  =PARA HACER=
    
}