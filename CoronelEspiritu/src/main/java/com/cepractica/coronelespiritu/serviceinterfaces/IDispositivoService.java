package com.cepractica.coronelespiritu.serviceinterfaces;

import com.cepractica.coronelespiritu.entities.Dispositivo;

import java.time.LocalDate;
import java.util.List;

public interface IDispositivoService {

    public void insert(Dispositivo dispositivo);
    public List<Object[]> getTotalMinutosJuegoPorDispositivo();

    public List<Object[]> getTotalDispositivosCompradosPorTipoEnPeriodo(LocalDate startDate, LocalDate endDate);
}
