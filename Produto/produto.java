package Produto;

public class produto {
    String nome;
    double valor;
    int quantidade;

    produto(String nome, double valor, int quantidade) {
        this.setNome(nome);
        this.setValor(valor);
        this.setQuantidade(quantidade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getQuantidade(){
        return this.quantidade;
    }

    public Boolean verificarDispobilidade(int qtde){
        if(qtde >= this.quantidade && qtde > 0){
            return true;
        } else {
            System.out.println("Quantidade insuficiente!");
            return false;
        }
    }

    public void adicionarUnidades(int qtde){
        this.quantidade += qtde;
    }
    
    public Boolean removerUnidades(int qtde){
        disponibilidadeProduto = verificarDispobilidade(qtde);

        if(disponibilidadeProduto){
            this.quantidade -= qtde;
            return true;
        } else {
            System.out.println("A quantidade do produto é menor do que a quantidade solicitada.");
            return false;
        }
    }

    public String toString() {
        return super.toString();
        return "Produto: " + this.produto + "\nValor: " + this.valor + "\nQuantidade: " + this.quantidade;    
    }
}


