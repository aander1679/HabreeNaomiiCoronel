package com.cepractica.coronelespiritu.repositories;

import com.cepractica.coronelespiritu.entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IDispositivoRepository extends JpaRepository<Dispositivo, Integer> {

    @Query("SELECT d.ceNombre AS nombreDispositivo, SUM(u.ceTiempoUsoMinutos) AS totalMinutosJuego " +
            "FROM Dispositivo d " +
            "JOIN App u ON d.ceId = u.ceIdDispositivo " +
            "WHERE u.ceTipo = 'juego' " +
            "GROUP BY d.ceNombre")
    List<Object[]> getTotalMinutosJuegoPorDispositivo();




    @Query("SELECT d.ceTipo, COUNT(d) AS total " +
            "FROM Dispositivo d " +
            "WHERE d.ceFechaCompra BETWEEN :startDate AND :endDate " +
            "GROUP BY d.ceTipo")
    List<Object[]> getTotalDispositivosCompradosPorTipoEnPeriodo(
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate);
}
