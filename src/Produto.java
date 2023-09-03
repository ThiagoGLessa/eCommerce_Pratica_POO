public class Produto {
    private String nomeProduto;
    private String descricaoProduto;
    private double valorProduto;
    private int quantidadeEstoque;

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto(){
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto){
        this.descricaoProduto = descricaoProduto;
    }

    public double getValorProduto(){
        return valorProduto;
    }

    public void setValorProduto(double valorProduto){
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
