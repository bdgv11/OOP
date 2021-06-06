package com.ucreativa.vacunacion.entities;

public class Vacuna {

    private String empresaCreadora;
    private double precio;
    private String nombreVacuna;
    private int cantidadDosis;
    private int eficacia;
    private Boolean relacionCovid;

    public Vacuna(String empresaCreadora, double precio, String nombreVacuna, int cantidadDosis, int eficacia, Boolean relacionCovid){
        this.empresaCreadora = empresaCreadora;
        this.precio = precio;
        this.nombreVacuna = nombreVacuna;
        this.cantidadDosis = cantidadDosis;
        this.eficacia = eficacia;
        this.relacionCovid = relacionCovid;
    }

    public String getEmpresaCreadora() {
        return empresaCreadora;
    }

    public void setEmpresaCreadora(String empresaCreadora) {
        this.empresaCreadora = empresaCreadora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public int getCantidadDosis() {
        return cantidadDosis;
    }

    public void setCantidadDosis(int cantidadDosis) {
        this.cantidadDosis = cantidadDosis;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }


    public Boolean getRelacionCovid() {
        return relacionCovid;
    }

    public void setRelacionCovid(Boolean relacionCovid) {
        this.relacionCovid = relacionCovid;
    }

    //public abstract String informacion();
}
