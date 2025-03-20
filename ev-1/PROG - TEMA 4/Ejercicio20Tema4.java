/*Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifra*/

import java.util.Scanner;

public class Ejercicio20Tema4 {
	
	public static void main (String[] args) {
		//volteado = n%10;
		//residuo = n/10;
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa le diremos si un número introducido por teclado es capicúa o no");
		System.out.print("Introduce el número (máximo 5 dígitos y entero): ");
		int n = s.nextInt(),residuo,volteado, nPos= Math.abs(n);
		String respuesta = "El número " + n+ " ", volt="", num = ""+nPos;
		if (n>99999 || n<-99999){
			System.out.print("El número solo puede contener 5 cifras");
		}else{
			if (nPos<10){
				respuesta+= " solo contiene una cifra";
				volt = ""+num;
			}else if (nPos<100){
				volteado = nPos%10;
				residuo = nPos/10;
				volt= ""+volteado+""+residuo%10;
				if (residuo==volteado){
					respuesta+= "es capicúa";
				}else{
					respuesta+= "no es capicúa";
					}
			}else if (nPos<1000){
				volteado = nPos%10;
				residuo = nPos/100;
				volt= ""+volteado+""+residuo%10;
				if (residuo==volteado){
					respuesta+= "es capicúa";
				}else{
					respuesta+= "no es capicúa";
				}
			}else if (nPos<10000){
				volteado = nPos%10;
				residuo = nPos/10;
				volt= ""+volteado+""+residuo%10;
				residuo/=10;
				volt+=""+residuo%10;
				residuo/=10;
				volt+=""+residuo;
				if (num.equals(volt)){
					respuesta+= "es capicúa";
				}else{
					respuesta+= "no es capicúa";
				}
					
			}else{
				volteado = nPos%10;
				residuo = nPos/10;
				volt= ""+volteado+""+residuo%10;
				residuo/=10;
				volt+=""+residuo%10;
				residuo/=10;
				volt+=""+residuo%10;
				residuo/=10;
				volt+=""+residuo;
				if (num.equals(volt)){
					respuesta+= "es capicúa";
				}else{
					respuesta+= "no es capicúa";
				}
			}
		}
		System.out.println(respuesta);
		System.out.print("Número volteado: "+ volt);
	}
}

