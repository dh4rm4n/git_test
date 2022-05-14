package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tus nombres: ");
        String apellido = msg.solicitaDatos("Escribe tus apellidos: ");
        Persona p1 = new Persona(nombre, apellido);
        msg.saludar(p1);
    }
}
