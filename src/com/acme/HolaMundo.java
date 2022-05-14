package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tus nombres: ");
        msg.saludar(nombre);
    }
}
