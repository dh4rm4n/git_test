package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Digita tus nombres: ");
        msg.saludar(nombre);
        //Comentario desde editor web
    }
}
