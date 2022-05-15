package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu nombre: ");
        String apellido = msg.solicitaDatos("Escribe tu apellido: ");
        msg.saludar(nombre);
    }
}
