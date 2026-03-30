package net.salesianos.carpeta3;
import net.salesianos.carpeta1.Personaje;

public class Guerrero extends Personaje {

    private String arma;

    public Guerrero(String nombre, int nivel, String arma){
        super(nombre, nivel);
        this.arma = arma;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Arma: " + arma);
    }
    
    public void ataquePesado(){
        gastarEnergia(15);
    }
}
