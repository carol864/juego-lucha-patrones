package com.juego.patrones.factory;

import com.juego.model.Personaje;
import com.juego.model.Guerrero;
import com.juego.model.Mago;
import com.juego.model.Ninja;

public class FactoryPersonaje {

    public Personaje crearPersonaje(String tipo){

        if(tipo.equalsIgnoreCase("guerrero")){

            return new Guerrero();

        }


        if(tipo.equalsIgnoreCase("mago")){

            return new Mago();

        }

        if(tipo.equalsIgnoreCase("ninja")){

            return new Ninja();

        }

        return null;

    }

    
}
