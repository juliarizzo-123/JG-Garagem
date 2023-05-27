public class Veiculo {
    private String nome;
    private String cor;
    private double preco;
    private int ano;

    public Veiculo(String nome, String cor, double preco, int ano) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
        this.ano = ano;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}