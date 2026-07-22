package Tema03;

import java.util.Scanner;

public class CondicionalIf1 {
    public static void main(String[] args) {

        //Programa que indica mayoría de edad

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");

        int edad  = sc.nextInt();

        if (edad >= 18){
            System.out.println("Bienvenido a la  mayoría de edad");
        }else {
            System.out.println("Eres muy joven");
        }
    }

}
