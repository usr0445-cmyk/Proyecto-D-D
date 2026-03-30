package net.salesianos.carpeta2;
import net.salesianos.carpeta1.Personaje;

public class Mago extends Personaje {

    private String elemento;

    public Mago(String nombre, int nivel, String elemento){
        super(nombre, nivel);
        this.elemento = elemento;

    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nivel: " + getNivel());
        System.out.println("Elemento: " + elemento);

    }

    public void ataqueElemental(){
        gastarEnergia(25);
    }
}
