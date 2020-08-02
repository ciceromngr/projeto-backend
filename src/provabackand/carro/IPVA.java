package provabackand.carro;

public class IPVA extends Veiculo {
    private double valorIpva;
    private double taxaLicenciamento;

   
    public IPVA(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
        super(modelo, placa, combustivel, valorVeiculo);
        this.taxaLicenciamento = taxaLicenciamento;
    }

    public double getValorIpva() {
        return valorIpva;
    }

    public void calculaIpva(){
        if(this.combustivel.equals("Gás")){
        System.out.println("------------- CARRO ------------");
        System.out.println("Modelo: "+getModelo()+"\nPlaca: "+getPlaca()+"\nValor do veiculo: "+getValorVeiculo()+"\nCombustível: "+getCombustivel());
        System.out.println("Com o IPVA de:"+(this.valorIpva=(valorVeiculo*0.01))+" Mais taxa de licenciamento: "+this.taxaLicenciamento);
        System.out.println("Preco atribuido com a taxa: "+(this.valorIpva=(valorVeiculo*0.01)+this.taxaLicenciamento));
        System.out.println("\n");
    }
    else 
        
        if(this.combustivel.equals("Flex")){
        System.out.println("------------- CARRO ------------");
        System.out.println("Modelo: "+getModelo()+"\nPlaca: "+getPlaca()+"\nValor do veiculo: "+getValorVeiculo()+"\nCombustível: "+getCombustivel());
        System.out.println("Com o IPVA de: "+(this.valorIpva=(valorVeiculo*0.01))+" Mais taxa de licenciamento: "+this.taxaLicenciamento);
        System.out.println("Preco atribuido com a taxa: "+(this.valorIpva=(valorVeiculo*0.01)+this.taxaLicenciamento));
        System.out.println("\n");
        }
        
    else 
        if(this.combustivel.equals("Gasolina")){
        System.out.println("------------- CARRO ------------");
        System.out.println("Modelo: "+getModelo()+"\nPlaca: "+getPlaca()+"\nValor do veiculo: "+getValorVeiculo()+"\nCombustível: "+getCombustivel());
        System.out.println("Com o IPVA de: "+(this.valorIpva=(valorVeiculo*0.01))+" Mais taxa de licenciamento: "+this.taxaLicenciamento);
        System.out.println("Preco atribuido com a taxa: "+(this.valorIpva=(valorVeiculo*0.01)+this.taxaLicenciamento));
        System.out.println("\n");
        }
    }
    


    /**
     * @param valorIpva the valorIpva to set
     */
    public void setValorIpva(double valorIpva) {
        this.valorIpva = valorIpva;
    }

    /**
     * @return double return the taxaLicenciamento
     */
    public double getTaxaLicenciamento() {
        return taxaLicenciamento;
    }

    /**
     * @param taxaLicenciamento the taxaLicenciamento to set
     */
    public void setTaxaLicenciamento(double taxaLicenciamento) {
        this.taxaLicenciamento = taxaLicenciamento;
    }

}