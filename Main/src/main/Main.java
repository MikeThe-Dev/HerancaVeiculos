
package main;

/**
 *
 * @author MIKE
 */
public class Main {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Ford", "Fiesta", 2020);
        Carro carro = new Carro("Volkswagen", "Golf", 2021, "Gasolina");
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Cybertruck", 2019, "Elétrico", 100.0);

        System.out.println("Veiculo:");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());

        System.out.println("\nCarro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Tipo de Combustivel: " + carro.getTipoDeCombustivel());

        System.out.println("\nCarro Eletrico:");
        System.out.println("Marca: " + carroEletrico.getMarca());
        System.out.println("Modelo: " + carroEletrico.getModelo());
        System.out.println("Ano: " + carroEletrico.getAno());
        System.out.println("Tipo de Combustivel: " + carroEletrico.getTipoDeCombustivel());
        System.out.println("Capacidade da Bateria: " + carroEletrico.getCapacidadeBateria() + " kWh");
    }
}
