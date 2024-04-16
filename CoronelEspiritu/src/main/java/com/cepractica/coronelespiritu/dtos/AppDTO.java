package com.cepractica.coronelespiritu.dtos;



import java.time.LocalDate;

public class AppDTO {


    private int ceId;


    private String ceNombre;


    private double ceTiempoUsoMinutos;


    private String ceTipo;


    private double ceMemoriaOcupada;


    private int ceIdDispositivo;



    public int getCeId() {
        return ceId;
    }

    public void setCeId(int ceId) {
        this.ceId = ceId;
    }

    public String getCeNombre() {
        return ceNombre;
    }

    public void setCeNombre(String ceNombre) {
        this.ceNombre = ceNombre;
    }

    public double getCeTiempoUsoMinutos() {
        return ceTiempoUsoMinutos;
    }

    public void setCeTiempoUsoMinutos(double ceTiempoUsoMinutos) {
        this.ceTiempoUsoMinutos = ceTiempoUsoMinutos;
    }

    public String getCeTipo() {
        return ceTipo;
    }

    public void setCeTipo(String ceTipo) {
        this.ceTipo = ceTipo;
    }

    public double getCeMemoriaOcupada() {
        return ceMemoriaOcupada;
    }

    public void setCeMemoriaOcupada(double ceMemoriaOcupada) {
        this.ceMemoriaOcupada = ceMemoriaOcupada;
    }

    public int getCeIdDispositivo() {
        return ceIdDispositivo;
    }

    public void setCeIdDispositivo(int ceIdDispositivo) {
        this.ceIdDispositivo = ceIdDispositivo;
    }
}
