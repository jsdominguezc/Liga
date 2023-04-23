package com.liga.liga.dto;

import com.liga.liga.entities.Jugador;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class JugadoresEquipoDto {

    @Getter
    @Setter
    private Jugador idJugador;
    @Getter
    @Setter
    private Long idEquipo;
    @Setter
    @Getter
    private boolean estado;

}
