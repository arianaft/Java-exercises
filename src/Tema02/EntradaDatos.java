package Tema02;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {

        //Programa que pide nombre y edad

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce tu edad");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + " Tienes " + edad + " años");

        entrada.close();
    }

}
