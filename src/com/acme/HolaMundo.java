package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Digita tus nombres: ");
        String apellido = msg.solicitaDatos("Digita tus apellidos: ");
        Persona p1 = new Persona(nombre, apellido);
        msg.saludar(p1);
    }
}
