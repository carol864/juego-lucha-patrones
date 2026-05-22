package com.juego.patrones;

import com.juego.model.Guerrero;
import com.juego.model.Personaje;

import com.juego.patrones.decorator.Escudo;
import com.juego.patrones.decorator.Espada;
import com.juego.patrones.decorator.Pistola;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    void escudoAumentaVida(){

        Personaje personaje = new Guerrero();
        personaje = new Escudo(personaje);

        assertEquals(120, personaje.getPuntosDeVida());
    }

    @Test
    void espadaModificaNombre(){

        Personaje personaje = new Guerrero();
        personaje = new Espada(personaje);

        assertEquals("Guerrero + Espada", personaje.getNombre());
    }

    @Test
    void pistolaModificaNombre(){

        Personaje personaje = new Guerrero();
        personaje = new Pistola(personaje);

        assertEquals("Guerrero + Pistola", personaje.getNombre());
    }

}
