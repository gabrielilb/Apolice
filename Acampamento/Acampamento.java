class Acampamento {

    private String nome;
    private int idade;
    private char equipe; 

    Acampamento(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    void definirEquipe() {
        if(this.getIdade() >= 6 && this.getIdade() <= 10){
            this.setEquipe('A');
        }
        if(this.getIdade() >= 11 && this.getIdade() <= 20){
            this.setEquipe('B');
        }
        if(this.getIdade() >= 21){
            this.setEquipe('C');
        }
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setEquipe(char equipe){
        this.equipe = equipe;
    }

    public char getEquipe(){
        return this.equipe;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nEquipe: " +this.getEquipe();
    }
}