package com.ucreativa.vacunacion.entities;


import java.util.Date;

public class BitacoraVacuna {

    private Persona persona;
    private Date fecha;
    private Vacuna vacuna;

    public BitacoraVacuna(Persona persona,Date fecha, Vacuna vacuna) {
        this.persona = persona;
        this.fecha = fecha;
        this.vacuna = vacuna;
    }

    public Persona getPersona() {
        return persona;
    }

    public Vacuna getVacuna(){
        return vacuna;
    }

    public Date getFecha() {
        return fecha;
    }
}