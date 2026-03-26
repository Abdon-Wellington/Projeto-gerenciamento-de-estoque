package produtos;

class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }
    
    @Override
    public double calcularValor() {
        return preco * quantidade;
    }
}