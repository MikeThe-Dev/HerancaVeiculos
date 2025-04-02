/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author MIKE
 */
public class CarroEletrico extends Carro {
    private double capacidadeBateria;

    public CarroEletrico(String marca, String modelo, int ano, String tipoDeCombustivel, double capacidadeBateria) {
        super(marca, modelo, ano, tipoDeCombustivel);
        this.capacidadeBateria = capacidadeBateria;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }
}