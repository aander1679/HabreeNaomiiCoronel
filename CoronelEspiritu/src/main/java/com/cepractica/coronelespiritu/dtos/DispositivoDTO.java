package com.cepractica.coronelespiritu.dtos;


import java.time.LocalDate;

public class DispositivoDTO {


    private int ceId;



    private String ceNombre;



    private String ceTipo;



    private String ceSistemaOperativo;



    private LocalDate ceFechaCompra;



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
