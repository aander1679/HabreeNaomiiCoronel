package com.cepractica.coronelespiritu.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="app")
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ceId;

    @Column(name = "ceNombre", nullable = false)
    private String ceNombre;

    @Column(name = "ceTiempoUsoMinutos", nullable = false)
    private double ceTiempoUsoMinutos;

    @Column(name = " ceTipo", nullable = false)
    private String ceTipo;

    @Column(name = "ceMemoriaOcupada", nullable = false)
    private double ceMemoriaOcupada;

    @Column(name = "ceIdDispositivo", nullable = false)
    private int ceIdDispositivo;

    public App(){}

    public App(int ceId, String ceNombre, double ceTiempoUsoMinutos, String ceTipo, double ceMemoriaOcupada, int ceIdDispositivo) {
        this.ceId = ceId;
        this.ceNombre = ceNombre;
        this.ceTiempoUsoMinutos = ceTiempoUsoMinutos;
        this.ceTipo = ceTipo;
        this.ceMemoriaOcupada = ceMemoriaOcupada;
        this.ceIdDispositivo = ceIdDispositivo;
    }

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
