public class Apolice {

    int numApolice, idade;
    String nomeSegurado, cidade;
    float valorPremio;
    static int ultimoNumApolice = 0;

    Apolice(){
        ultimoNumApolice++;
        numApolice = ultimoNumApolice; 
    }

    Apolice(String nomeSegurado, int idade, float valorPremio){
        ultimoNumApolice++;
        this.idade = idade;
        this.nomeSegurado =  nomeSegurado;
        this.valorPremio = valorPremio;
    }

    void imprimir(){
        System.out.println("Número Apolice: " + numApolice);
        System.out.println("Nome Segurado: " + nomeSegurado);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do prêmio: " + valorPremio);
    }

    void calcularPremio(){
        if(this.idade >= 18 && this.idade <= 25){
            this.valorPremio += valorPremio * 0.20;
        }
        if(this.idade >= 25 && this.idade <= 36){
            this.valorPremio += valorPremio * 0.15;
        }
        if(this.idade > 36){
            this.valorPremio += valorPremio * 0.10;
        }
    }

    float oferecerDesconto(String cidade) {
        if(cidade.equals("Florianópolis")){
            this.valorPremio -= valorPremio * 0.95;
            return this.valorPremio;
        }
        if(cidade.equals("Chapecó")){
            this.valorPremio -= valorPremio * 0.94;
            return this.valorPremio;
        }
        if(cidade.equals("Joaçaba")){
            this.valorPremio -= valorPremio * 0.93;
            return this.valorPremio;
        }
        if(cidade.equals("Joinville")){
            this.valorPremio -= valorPremio * 0.92;
            return this.valorPremio;
        }
        return this.valorPremio;
    }

    void exibeUltimoNum(){
        System.out.println(Apolice.ultimoNumApolice);
    }
}
