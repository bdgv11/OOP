package com.ucreativa.familia;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacuna;
import com.ucreativa.vacunacion.entities.Familiar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar padre = new Familiar("Omar","302600510",58,true,"padre");
        Amigo compaBrete = new Amigo("Danny","132456", 24,true,"compa","face.com");

        List<BitacoraVacuna> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacuna(padre,"Pfizer", new Date()));
        bitacora.add(new BitacoraVacuna(compaBrete,"Astrazeneca", new Date()));
    }
}