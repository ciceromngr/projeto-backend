package provabackand.carro;

public class Veiculo {
    protected String modelo;
    protected String placa;
    protected String combustivel;
    protected double valorVeiculo;

    
    public Veiculo(String modelo, String placa, String combustivel, double valorVeiculo) {
        this.modelo = modelo;
        this.placa = placa;
        this.combustivel = combustivel;
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo modelo: " + modelo + "\n combustivel: " + combustivel + "\nplaca: " + placa + ", valorVeiculo: "
                + valorVeiculo;
    }
   
    /**
     * @param valorVeiculo the valorVeiculo to set
     */

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

}