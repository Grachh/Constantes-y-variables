// AUTOR: Javier Galve

import junit.framework.TestCase;

public class UE03_Entrega1Prueba extends TestCase{
  
  public void testSumaMonedas(){
    UE03_Entrega1 entrega1 = new UE03_Entrega1();
    assertEquals(entrega1.sumaMonedas(1, 2, 3, 4, 5, 6), 156);
    assertEquals(entrega1.sumaMonedas(1, 1, 1, 1, 1, 1), 88);
    assertEquals(entrega1.sumaMonedas(5, 2, 1, 1, 1, 0), 307);
    assertEquals(entrega1.sumaMonedas(0, 0, 0, 1, 1, 0), 7);
    assertEquals(entrega1.sumaMonedas(0, 0, 1, 1, 2, 0), 19);
    assertEquals(entrega1.sumaMonedas(0, 0, 0, 0, 0, 0), 0);
    assertEquals(entrega1.sumaMonedas(10, 0, 0, 0, 0, 0), 500);
  }
  
  public void testHoraASegundos(){
    UE03_Entrega1 entrega1 = new UE03_Entrega1();
    assertEquals(entrega1.horaASegundos(1, 1, 1), 3661);
    assertEquals(entrega1.horaASegundos(2, 10, 20), 7820);
    assertEquals(entrega1.horaASegundos(2, 1, 0), 7260);
    assertEquals(entrega1.horaASegundos(0, 0, 0), 0);
    assertEquals(entrega1.horaASegundos(0, 1, 0), 60);
    assertEquals(entrega1.horaASegundos(0, 0, 59), 59);
    assertEquals(entrega1.horaASegundos(23, 59, 59), 86399);
  }
  
  public void testSegundosAHora(){
    UE03_Entrega1 entrega1 = new UE03_Entrega1();
    assertEquals(entrega1.segundosAHora(3600), "1:0:0");
    assertEquals(entrega1.segundosAHora(59), "0:0:59");
    assertEquals(entrega1.segundosAHora(3661), "1:1:1");
    assertEquals(entrega1.segundosAHora(60), "0:1:0");
    assertEquals(entrega1.segundosAHora(7820), "2:10:20");
    assertEquals(entrega1.segundosAHora(0), "0:0:0");
    assertEquals(entrega1.segundosAHora(86399), "23:59:59");
  }
  
  public void testHacen10(){
    UE03_Entrega1 entrega1 = new UE03_Entrega1();
    assertEquals(entrega1.hacen10(9, 10), true);
    assertEquals(entrega1.hacen10(9, 9), false);
    assertEquals(entrega1.hacen10(1, 9), true);
    assertEquals(entrega1.hacen10(3, 7), true);
    assertEquals(entrega1.hacen10(0, 10), true);
    assertEquals(entrega1.hacen10(-1, 11), true);
    assertEquals(entrega1.hacen10(10, 10), true);
  }
  
  public void testEn3050(){
    UE03_Entrega1 entrega1 = new UE03_Entrega1();
    assertEquals(entrega1.en3050(30, 31), true);
    assertEquals(entrega1.en3050(30, 41), false);
    assertEquals(entrega1.en3050(40, 50), true);
    assertEquals(entrega1.en3050(42, 45), true);
    assertEquals(entrega1.en3050(42, 30), false);
    assertEquals(entrega1.en3050(2, 45), false);
    assertEquals(entrega1.en3050(1, 1), false);
  }
  
  public void testUltimosIguales(){
    UE03_Entrega1 entrega1 = new UE03_Entrega1();
    assertEquals(entrega1.ultimosIguales(27, 57), true);
    assertEquals(entrega1.ultimosIguales(27, 59), false);
    assertEquals(entrega1.ultimosIguales(7, 0), false);
    assertEquals(entrega1.ultimosIguales(879, 999), true);
    assertEquals(entrega1.ultimosIguales(252345879, 999345549), true);
  }
  
}