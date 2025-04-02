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
