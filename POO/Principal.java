package POO;

public class Principal {
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Maria");
        pessoa1.setIdade(20);
        pessoa1.setPeso(40.0);

        System.out.println("Nome: " + pessoa1.getNome() + "Idade: " + pessoa1.getIdade() + "Peso: " + pessoa1.getPeso());
    }
    
}
