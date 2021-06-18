package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.services.BitacoraService;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nombre, cedula, edad, riesgo, isAmigo, relacion = null, facebook = null, parentesco = null, marca;
        Persona persona;
        BitacoraService service = new BitacoraService(new FileRepository());
        Repository repo = new FileRepository();

        boolean bandera = true;
        while (bandera) {

            System.out.println("");
            System.out.println("--Digite la siguiente informacion--");
            System.out.println("");

            System.out.println("Nombre de la persona:");
            nombre = scan.nextLine();

            System.out.println("Cedula de la persona:");
            cedula = scan.nextLine();

            System.out.println("Edad de la persona");
            edad = scan.nextLine();

            System.out.println("Tiene riesgo? (S/N)");
            riesgo = scan.nextLine();

            System.out.println("Amigo (A)/ Familiar(F)");
            isAmigo = scan.nextLine();

            if (isAmigo.equals("A")) {
                System.out.println("Relacion:");
                relacion = scan.nextLine();
                System.out.println("Facebook:");
                facebook = scan.nextLine();

                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);

            } else {
                System.out.println("Parentesco:");
                parentesco = scan.nextLine();

                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("F"), parentesco);
            }
            System.out.println("Cual es la marca de la vacuna que le pusieron?");
            marca = scan.nextLine();
            service.save(nombre,cedula,edad,riesgo,isAmigo,relacion,facebook,parentesco,marca);

            repo.save(persona, marca, new Date());

            System.out.println("Desea imprimir la lista (S)");
            String print = scan.nextLine();

            if (print.equals("S")) {

                for ( String item : repo.get()) {
                    System.out.println(item);
                }
            }else{
                System.out.println("Gracias por utilizar el sistema...");
                bandera = false;
            }
        }
    }
}