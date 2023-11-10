/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaluchador;

/**
 *
 * @author Pc
 */
public class Luchador {
    private String ciudad;
    private String clima;
    private int rondas;
    private String habilidades; 

    // Constructor
    public Luchador(String ciudad, String clima, int rondas, String habilidades) {
        this.ciudad = ciudad;
        this.clima = clima;
        this.rondas = rondas;
        this.habilidades = habilidades;
    }

    public void mostrarInformacion() {
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Clima: " + clima);
        System.out.println("Rondas: " + rondas);
        System.out.println("Habilidades: " + habilidades);
    }
}