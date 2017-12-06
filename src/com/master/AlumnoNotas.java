package com.master;


public class AlumnoNotas {

    /*
     * Crear un array con las notas de un alumno, mostrar la media y que pinte una cañificación.
     * {3, 5, 7, 6, 9} -> Calcular la media <-
     * 0 - 4.9 -> Insuficiente
     * 5 - 5.9 -> Suficiente
     * 6 - 6.9 -> Bien
     * 7 - 8.9 -> Notable
     * 9 - 10 -> Sobresaliente.
     */
    public static void main(String[] args){

        double[] notas = {3, 5, 7, 6, 9};
         notas = new double[]{5,6,7,8,9};
         notas = new double[]{8,10,10,9,10};
         notas = new double[]{10,10,10,9};
         notas = new double[]{10, 10 , 10 , 10};
         notas = new double[]{3,5,7,6,9};

        double media = 0;

        for (double nota : notas) {

            media += (nota)/4;

        }
        System.out.println("Tu nota media es: "+media);
        if (media <= 4.9){
            System.out.println("Insuficiente , Necesitas mejorar.");
            }else if(media <= 5.9){
                System.out.println("Suficiente, Un poco mas de esfuerzo la proxima vez.");

            }else if(media <=6.9){
                System.out.println("Estas en el buen camino sigue asi.");

            }else if(media <=8.9){
                System.out.println("GENIAL !! Un poco mas y alcanzaras la excelencia ");

            }else {
            System.out.println("Excelente !!! Sigue asi el camino del exito está en tu mano.");

        }
        }


        }

