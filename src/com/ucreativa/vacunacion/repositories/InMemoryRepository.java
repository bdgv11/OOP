package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacuna;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository {

    private List<BitacoraVacuna> bd;

    public InMemoryRepository(){
        this.bd = new ArrayList<>();
    }

    public void save(Persona persona, String marca, Date fecha){
        this.bd.add(new BitacoraVacuna(persona, marca, fecha));
    }

    public List<String> getList() {

        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        for(BitacoraVacuna item : bd){
            lines.add(item.getPersona().getNombre()
                    + " con la vacuna " + item.getMarca()
                    + " fue vacunado(a) el: " + format.format(item.getFecha()));
        }
        return lines;
    }
}
