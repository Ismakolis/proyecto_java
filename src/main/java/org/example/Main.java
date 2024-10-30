package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //crear el primer objeto 1
        persona persona1 = new persona();
        persona1.ingresarDatos();
        persona1.imprimir();
        //creamos el objeto 2
        persona persona2 = new persona();
        persona2.ingresarDatos();
        persona2.imprimir();



    }
}