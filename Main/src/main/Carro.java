/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author MIKE
 */
public class Carro extends Veiculo {
    private String tipoDeCombustivel;

    public Carro(String marca, String modelo, int ano, String tipoDeCombustivel) {
        super(marca, modelo, ano);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }
}
