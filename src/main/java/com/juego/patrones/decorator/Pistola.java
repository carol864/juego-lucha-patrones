package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class Pistola extends DecoradorPersonaje{

    public Pistola(Personaje personaje){

        super(personaje);
    }

    public String getNombre(){

        return personaje.getNombre() + " + Pistola";
    }

}
