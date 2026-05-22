package com.juego.juego;

import java.util.Scanner;

import com.juego.model.Personaje;

import com.juego.patrones.factory.FactoryPersonaje;

import com.juego.patrones.decorator.Escudo;
import com.juego.patrones.decorator.Espada;
import com.juego.patrones.decorator.Pistola;


public class JuegoLucha {

    private Scanner scanner = new Scanner(System.in);

    public void iniciarPelea(){

        FactoryPersonaje factory = new FactoryPersonaje();

        System.out.println("Jugador 1:");
        Personaje jugador1 =crearJugador(factory);

        System.out.println("Jugador 2:");
        Personaje jugador2 = crearJugador(factory);


        while(jugador1.estaVivo() && jugador2.estaVivo()){

            int dano1 = (int)(Math.random() * 20);

            jugador2.recibirDano(dano1);

            System.out.println(jugador1.getNombre() + " ataca a " + jugador2.getNombre() + " daño: " + dano1);

            if(!jugador2.estaVivo()){

                break;
            }

            int dano2 = (int) (Math.random() * 20);

            jugador1.recibirDano(dano2);

            System.out.println(jugador2.getNombre() + " ataca a " + jugador1.getNombre() + " daño: " + dano2);
        }

        if(jugador1.estaVivo()){

            System.out.println(jugador1.getNombre() + " GANA");
        }

        else{

            System.out.println(jugador2.getNombre() + " GANA");
        }


    }


    private Personaje crearJugador(FactoryPersonaje factory){

        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Ninja");

        int opcion = scanner.nextInt();

        Personaje personaje = null;

        if(opcion == 1){

            personaje = factory.crearPersonaje("guerrero");
        }

        if(opcion == 2){

            personaje = factory.crearPersonaje("mago");
        }

        if(opcion == 3){

            personaje = factory.crearPersonaje("ninja");
        }

        System.out.println("Equipamiento:");

        System.out.println("1. Escudo");
        System.out.println("2. Espada");
        System.out.println("3. Pistola");

        int arma = scanner.nextInt();

        if(arma == 1){

            personaje = new Escudo(personaje);
        }

        if(arma == 2){

            personaje =new Espada(personaje);
        }

        if(arma == 3){

            personaje = new Pistola(personaje);
        }

        return personaje;

    }

}