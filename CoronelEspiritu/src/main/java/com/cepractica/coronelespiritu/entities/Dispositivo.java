package com.cepractica.coronelespiritu.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="dispositivo")
public class Dispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ceId;


    @Column(name = "ceNombre", nullable = false)
    private String ceNombre;


    @Column(name = "ceTipo", nullable = false)
    private String ceTipo;


    @Column(name = "ceSistemaOperativo", nullable = false)
    private String ceSistemaOperativo;


    @Column(name = "ceFechaCompra", nullable = false)
    private LocalDate ceFechaCompra;

    public Dispositivo() {}

    public Dispositivo(int ceId, String ceNombre, String ceTipo, String ceSistemaOperativo, LocalDate ceFechaCompra) {
        this.ceId = ceId;
        this.ceNombre = ceNombre;
        this.ceTipo = ceTipo;
        this.ceSistemaOperativo = ceSistemaOperativo;
        this.ceFechaCompra = ceFechaCompra;
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

    public String getCeTipo() {
        return ceTipo;
    }

    public void setCeTipo(String ceTipo) {
        this.ceTipo = ceTipo;
    }

    public String getCeSistemaOperativo() {
        return ceSistemaOperativo;
    }

    public void setCeSistemaOperativo(String ceSistemaOperativo) {
        this.ceSistemaOperativo = ceSistemaOperativo;
    }

    public LocalDate getCeFechaCompra() {
        return ceFechaCompra;
    }

    public void setCeFechaCompra(LocalDate ceFechaCompra) {
        this.ceFechaCompra = ceFechaCompra;
    }
}
