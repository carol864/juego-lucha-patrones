package com.juego.patrones;

import com.juego.model.Personaje;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class PersonajeMockitoTest {


    @Test
    void testMockPersonaje(){

        Personaje personaje = mock(Personaje.class);

        when(personaje.getNombre()).thenReturn("Guerrero Mock");
        when(personaje.getPuntosDeVida()).thenReturn(999);

        assertEquals("Guerrero Mock", personaje.getNombre());
        assertEquals(999, personaje.getPuntosDeVida());
    }

}
