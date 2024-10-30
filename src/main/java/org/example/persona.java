package org.example;
import java.util.Scanner;
/*
* Nombre:
* Detalle:
* Fecha: miercoles 30 de
*
*
* */
public class persona {
    //definimos los atributos de la persona
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int anio;

// Definimos un constructor vacio
    public persona (){

    }
// Definimos un constructor donde inicialise los
    //atributos del objeto
    public persona (String nombre,String apellido,String numeroDocumento,int anio){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroDocumento=numeroDocumento;
        this.anio=anio;
    }
    //Un metodo donde imprima los valores del objeto
   void imprimir(){
        System.out.println("Nombre:"+nombre);
       System.out.println("Apellido:"+apellido);
       System.out.println("numeroDocumento:"+numeroDocumento);
       System.out.println("Año:"+anio);
   }

   //metodo ingreso datos
    void ingresarDatos(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido=sc.nextLine();
        System.out.println("Ingrese el DNI: ");
        numeroDocumento=sc.nextLine();
        System.out.println("Ingrese el año de nacimiento: ");
        anio= sc.nextInt();

    }
    //metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
