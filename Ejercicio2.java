import java.util.Scanner;

public class Ejercicio2{
	public static void main (String[]arg){
	Scanner obj=new Scanner (System.in);
	int llantas,tot_pago;
	System.out.println("Ingrese la cantidad de llantas que desea comprar");
	llantas=obj.nextInt();
	if (llantas<5){
		tot_pago=llantas*300;
		System.out.println("Cada llanta tiene un costo $300, el total a pagar es:  "+tot_pago);
	}
	else if (llantas>4 && llantas<11){
		tot_pago=llantas*250;
		System.out.println("Cada llanta tiene un costo $250, el total a pagar es:  "+tot_pago);
	}
	else {
		tot_pago=llantas*200;
		System.out.println("Cada llanta tiene un costo $200, el total a pagar es:  "+tot_pago);
	}
	}
}
