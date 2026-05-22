package com.juego.patrones.decorator;

import com.juego.model.Personaje;


public class DecoradorPersonaje extends Personaje{

    protected Personaje personaje;

    public DecoradorPersonaje(Personaje personaje){

        super(personaje.getNombre());
        this.personaje = personaje;
    }

    public String getNombre(){

        return personaje.getNombre();
    }

    public int getPuntosDeVida(){

        return personaje.getPuntosDeVida();
    }

}