package com.juego.patrones;

import com.juego.model.Personaje;
import com.juego.patrones.factory.FactoryPersonaje;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class FactoryBordeTest {


    @Test
    void personajeInvalido(){

        FactoryPersonaje factory = new FactoryPersonaje();
        Personaje personaje = factory.crearPersonaje("dragon");

        assertNull(personaje);

    }

}
