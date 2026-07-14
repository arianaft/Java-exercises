package Tema02;
import javax.swing.*;

public class EntradaDatos2 {
    public static void main(String[] args) {

        //Programa que pide la edad y el nombre con JOptionPane

        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");

        //ParseInt convierte el String de JOptionPane a int

       int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
       double salario = Double.parseDouble(JOptionPane.showInputDialog("Itroduce tu salario"));

        System.out.println(" Te llamas " + nombre_usuario + " y el año que viene tendras " +  (edad +1) + " y tienes un salario de " +salario);

    }
}
