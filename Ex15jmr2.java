
/*
*ESTAN INCLUIDOS AMBOS EJERCICIOS (JAVIER MORENO RODRIGUEZ)
*
*/

public class Ex15jmr2 {
	
	public static void main (String[] args) {
    double multiplicador = 0;
    int cases;
    int num = 0;
    do {
    System.out.print("Introduzca la cantidad de polos que desea: ");
    num = Integer.parseInt(System.console().readLine());
    
      System.out.println("El pedido mínimo es de 20 polos. Inténtelo de nuevo. ");
    } while (num < 20);
    if (num < 39);
    {
      multiplicador = 4.90;
    }
    if (num >= 39 && num < 99){
    multiplicador = 3.90;
    }
    if (num > 99)
    {
     multiplicador = 3.20;
    }
     double adicion = 0;
     double mul = 0;
     int medidor = 0;
     String col = "blanco"; 
     int color = 0;
     do{
     System.out.print("¿Va a ser blanco o con color?, 0 = blanco 1 = negro = ");
     color = Integer.parseInt(System.console().readLine());
     if (color == 1){
       adicion = 0.20;
       col = "en color";
       medidor++;       
     }
     if (color == 0){
       medidor++;
     }} while (medidor == 0);
     int estilo;
     int contador1 = 0;
    do {
    System.out.print ("¿Seriegrafia o bordado?, seriegrafia = 0, bordado = 1 = ");
     estilo = Integer.parseInt(System.console().readLine());
     switch (estilo) {
       case 0:
        if (num < 50){
          mul = 2.0;
          contador1++;
          }
          else {
          mul = 1.50;
          contador1++;
          }
         break;
        case 1:
        if (num < 50){
          mul = 3;
          contador1++;
        } 
        else {
          mul = 2.50;
          contador1++;
        } 
       break; 
       } 
       } while (contador1 == 0) ;  
    System.out.println("EL POLITO BONITO - PRESUPUESTO" + "\n");
    double precio;
    double suma;
    double extra = (multiplicador + mul) * 0.20;
    suma = multiplicador + multiplicador * adicion;
    precio = num * suma + num * suma * adicion;
    double totaltextil = suma * num;
    double logo = mul * num + totaltextil;
    double iva = logo * 0.21;
    double totale = logo + iva;
    System.out.println("Polos " + col + " (unid.)   " + num);
    System.out.println ("Precio unitario     "  + suma);
    System.out.println("Total textil   " + totaltextil);
    System.out.println("Seriegrafía (c.u.) " + mul + " €");
    System.out.println("Polo más logotipo   " + logo);
    System.out.println("IVA       " + iva);
    System.out.println("TOTAL      " + totale);
    
		
	}
}

