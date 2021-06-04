package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacuna;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca;
        Persona persona;
        List<BitacoraVacuna> bitacora = new ArrayList<>();

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

            bitacora.add(new BitacoraVacuna(persona, marca, new Date()));

            System.out.println("Desea imprimir la lista (S)");
            String print = scan.nextLine();

            if (print.equals("S")) {

                for (BitacoraVacuna item : bitacora) {
                    System.out.println(item.getPersona().getNombre() + " fue vacunado(a) el: " + item.getFecha());
                }
            }else{
                System.out.println("Gracias por utilizar el sistema...");
                bandera = false;
            }
        }
    }
}
