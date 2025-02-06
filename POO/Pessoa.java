package POO;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;

    public Pessoa(){
        this.nome = "Maria";
        this.idade = 20;
        this.peso = 40.0;
    }

    public void setNome(String nome){
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

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }
    
}
