package com.juego.patrones.decorator;

import com.juego.model.Personaje;


public class Escudo extends DecoradorPersonaje{

    public Escudo(Personaje personaje){

        super(personaje);
    }


    public int getPuntosDeVida(){

        return personaje.getPuntosDeVida() + 20;
    }

}
