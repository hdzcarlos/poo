package com.videos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class video06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double suma = 0;
        int opcion;
        int opcion1;
        do {

            System.out.println("MENU.");
            System.out.println("====================");
            System.out.println("1.- Suma.");
            System.out.println("2.- Resta.");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Division");
            System.out.println("0.- Salir");
            System.out.println("====================");
            System.out.println("Introduzca una opcion.");
            System.out.print("--->");
            opcion = sc.nextInt();
              if (opcion == 0) {
                  break;
              }else if(opcion >=5){
                  System.out.println("----------- !! ERROR !! -----------");
                  System.out.println("No eligio ninguna opcion correcta, vuelva a inentarlo");
              }else {
                  System.out.println("======================");

                  System.out.println("Introduzca los numeros para operar.");
                  System.out.print("Primer numero: ");
                  num1 = sc.nextDouble();
                  System.out.print("Segundo numero: ");
                  num2 = sc.nextDouble();
                  if (opcion == 1 && opcion != 0) {
                      suma = (num1 + num2);
                      System.out.println("El resultado de la suma es " + suma);

                  } else if (opcion == 2 && opcion != 0) {
                      double resta = 0;
                      resta = (num1 - num2);
                      System.out.println("El resultado de la resta es " + resta);
                  } else if (opcion == 3 && opcion != 0) {
                      double producto = 0;
                      producto = (num1 * num2);
                      System.out.println("El resultado de la multiplicacion es: " + producto);
                  } else if (opcion == 4 && opcion != 0) {
                      double divisor = 0;
                      divisor = (num1 / num2);
                      System.out.println("El resultado de la division es: " + divisor);
                  } else {
                  //System.out.println("Ha elegido usted salir de la aplicacion hasta pronto");
                  }
                  System.out.println("¿Desea hacer otra operación?");
                  System.out.println("1.- SI:");
                  System.out.println("2.- NO");
                  System.out.print("--->");
                  opcion1 = sc.nextInt();
                  if (opcion1 == 2) {
                      break;
                  }
              }


        } while (opcion != 0) ;
        System.out.println("Ha elegido usted salir de la aplicacion, hasta pronto.");



    }
}
