public class Main {
    public static void main(String[] args) {

        //adicionando um veiculo
        Veiculo carro = new Veiculo("Fiat Uno", "Vermelho", 15000.0, 2010);
        System.out.println(carro.getNome()); // Saída: Fiat Uno

        carro.setPreco(18000.0);
        System.out.println(carro.getPreco()); // Saída: 18000.0

    }



}

