package com.cepractica.coronelespiritu.serviceimplements;

import com.cepractica.coronelespiritu.entities.Dispositivo;
import com.cepractica.coronelespiritu.repositories.IDispositivoRepository;
import com.cepractica.coronelespiritu.serviceinterfaces.IDispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DispositivoServiceImplement implements IDispositivoService {

    @Autowired
    private IDispositivoRepository dispositivoRepository;

    @Override
    public void insert(Dispositivo dispositivo){dispositivoRepository.save(dispositivo);}

    public List<Object[]> getTotalMinutosJuegoPorDispositivo() {
        return dispositivoRepository.getTotalMinutosJuegoPorDispositivo();
    }

    public List<Object[]> getTotalDispositivosCompradosPorTipoEnPeriodo(LocalDate startDate, LocalDate endDate) {
        return dispositivoRepository.getTotalDispositivosCompradosPorTipoEnPeriodo(startDate, endDate);
    }



}
