package com.juego.patrones;

import com.juego.model.Personaje;
import com.juego.patrones.factory.FactoryPersonaje;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryPersonajeTest {
    
        @Test
        void crearGuerrero(){
                FactoryPersonaje factory = new FactoryPersonaje();

                Personaje personaje = factory.crearPersonaje("guerrero");

                assertEquals("Guerrero", personaje.getNombre());
        }

        @Test
        void crearMago(){

                FactoryPersonaje factory = new FactoryPersonaje();

                Personaje personaje = factory.crearPersonaje("mago");

                assertEquals("Mago", personaje.getNombre());
        }

        @Test
        void crearNinja(){

                FactoryPersonaje factory = new FactoryPersonaje();

                Personaje personaje = factory.crearPersonaje("ninja");

                assertEquals("Ninja", personaje.getNombre());
        }

}
