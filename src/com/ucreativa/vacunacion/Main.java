package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, empresaCreadora, nombreVacuna, cantidadDosis, eficacia, precioVacuna, relacionCovid;
        Persona persona;
        Vacuna vacuna;
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

            System.out.println("Edad de la persona:");
            edad = scan.nextLine();

            System.out.println("Tiene riesgo? (S/N):");
            riesgo = scan.nextLine();

            System.out.println("Amigo (A)/ Familiar(F):");
            isAmigo = scan.nextLine();

            if (isAmigo.equals("A")) {
                System.out.println("Relacion:");
                relacion = scan.nextLine();
                System.out.println("Facebook:");
                facebook = scan.nextLine();

                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);

                //Info entidad vacuna
                System.out.println("Nombre de la empresa creadora:");
                empresaCreadora = scan.nextLine();
                System.out.println("Precio de la vacuna (unidad):");
                precioVacuna = scan.nextLine();
                System.out.println("Nombre de la vacuna:");
                nombreVacuna = scan.nextLine();
                System.out.println("Cantidad de vacunas necesarias para la persona:");
                cantidadDosis = scan.nextLine();
                System.out.println("Eficacia de la vacuna:");
                eficacia = scan.nextLine();
                System.out.println("Tiene relacion con el COVID-19? (S/N)");
                relacionCovid = scan.nextLine();


                vacuna = new Vacuna(empresaCreadora,Double.parseDouble(precioVacuna), nombreVacuna,Integer.parseInt(cantidadDosis),
                        Integer.parseInt(eficacia), relacionCovid.equals("F"));

            } else {
                System.out.println("Parentesco:");
                parentesco = scan.nextLine();

                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("F"), parentesco);

                //Info entidad vacuna
                System.out.println("Nombre de la empresa creadora:");
                empresaCreadora = scan.nextLine();
                System.out.println("Precio de la vacuna (unidad):");
                precioVacuna = scan.nextLine();
                System.out.println("Nombre de la vacuna:");
                nombreVacuna = scan.nextLine();
                System.out.println("Cantidad de vacunas necesarias para la persona:");
                cantidadDosis = scan.nextLine();
                System.out.println("Eficacia de la vacuna:");
                eficacia = scan.nextLine();
                System.out.println("Tiene relacion con el COVID-19? (S/N)");
                relacionCovid = scan.nextLine();

                vacuna = new Vacuna(empresaCreadora,Double.parseDouble(precioVacuna), nombreVacuna,Integer.parseInt(cantidadDosis),
                        Integer.parseInt(eficacia), relacionCovid.equals("F"));
            }
            bitacora.add(new BitacoraVacuna(persona, new Date(),vacuna));

            System.out.println("Desea imprimir la lista (S)");
            String print = scan.nextLine();

            if (print.equals("S")) {

                for (BitacoraVacuna item : bitacora) {
                    System.out.println(item.getPersona().getNombre() + " fue vacunado(a) el: " + item.getFecha()
                            + " con la vacuna de la empresa: " + item.getVacuna().getEmpresaCreadora()
                            + " y su nombre: " + item.getVacuna().getNombreVacuna()
                            + " la cual tiene una eficacia de: " + item.getVacuna().getEficacia() + "%");
                }
            }else{
                System.out.println("Gracias por utilizar el sistema...");
                bandera = false;
            }
        }
    }
}
