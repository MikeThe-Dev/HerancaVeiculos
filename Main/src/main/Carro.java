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
