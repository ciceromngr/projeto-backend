package testecarro;

import provabackand.carro.IPVA;

public class TesteCarro {
    public static void main(String[] args) {
        IPVA car1 = new IPVA("Gol", "abcs-1235", "Gás",45000 , 250);
        IPVA car2 = new IPVA("Covete", "XD-12543", "Flex",74000 , 550);
        IPVA car3 = new IPVA("Ford", "abcs-1235", "Gasolina",62000 , 547);
    
    
        car1.calculaIpva();
        car2.calculaIpva();
        car3.calculaIpva();
    }
}
