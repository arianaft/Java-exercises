package Tema03;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //Mayoria de edad con operador ternario

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad  = sc.nextInt();

        String resultado=(edad<18)? "Eres menor de edad":"Eres mayor de edad";
        System.out.println(resultado);
    }
}
