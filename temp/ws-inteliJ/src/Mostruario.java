public class Mostruario {
    private String produto;
    private double preco;
    private boolean desconto;

    /*construtor para acessar produtos da classe mostruário*/

    public Mostruario(String produto, double preco) {
        this.preco = preco;
        this.produto = produto;
    }

    public Mostruario(String produto, double preco,boolean desconto) {
        this.preco = preco;
        this.produto = produto;
        this.desconto = desconto;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public boolean getDesconto() {
        return desconto;
    }
    //por enquanto apenas getters para teste;

    @Override
    public String toString() {
        return "mostruario" +
                "produto='" + produto + ", preco=" + preco +
                ", desconto=" + desconto;
    }
}