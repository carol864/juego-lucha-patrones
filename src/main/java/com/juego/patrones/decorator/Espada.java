package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class Espada extends DecoradorPersonaje{

    public Espada(Personaje personaje){

        super(personaje);
    }

    public String getNombre(){

        return personaje.getNombre() + " + Espada";
    }

}
