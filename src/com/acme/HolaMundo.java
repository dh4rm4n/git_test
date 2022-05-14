package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu nombre completo: ");
        String apellido = msg.solicitaDatos("Escribe tus apellidos completos: ");
        Persona p1 = new Persona(nombre, apellido);
        msg.saludar(p1);
    }
}
