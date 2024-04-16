package com.cepractica.coronelespiritu.controllers;

import com.cepractica.coronelespiritu.dtos.DispositivoDTO;
import com.cepractica.coronelespiritu.entities.Dispositivo;
import com.cepractica.coronelespiritu.serviceinterfaces.IDispositivoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/coronelEspiritu/dispositivos")
public class DispositivoController {

    @Autowired
    private IDispositivoService dispositivoService;

    @PostMapping("/insert")
    public void registro(@RequestBody DispositivoDTO dispositivoDTO){
        ModelMapper m= new ModelMapper();
        Dispositivo dispositivo = m.map(dispositivoDTO,Dispositivo.class);
        dispositivoService.insert(dispositivo);

    }

    @GetMapping("/totalMinutosJuego")
    public ResponseEntity<List<Object[]>> getTotalMinutosJuegoPorDispositivo() {
        List<Object[]> resultados = dispositivoService.getTotalMinutosJuegoPorDispositivo();
        return ResponseEntity.ok(resultados);
    }

    @GetMapping("/totalDispositivosTipo")
    public ResponseEntity<List<Object[]>> getTotalDispositivosCompradosPorTipoEnPeriodo(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        List<Object[]> resultados = dispositivoService.getTotalDispositivosCompradosPorTipoEnPeriodo(startDate, endDate);
        return ResponseEntity.ok(resultados);
    }





}
