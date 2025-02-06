import java.util.Scanner;

public class Prova01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[100];
        int[] matriculas = new int[100];
        String[] cursos = new String[100];
        int opcao = 0;
        int quantidadeAlunos = 0;

        while (opcao != 5) {

            System.out.println("\nSistema de Gerenciamento de Alunos");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
        opcao = input.nextInt();
        input.nextLine();
         
            switch (opcao) {
                case 1:
                    quantidadeAlunos = cadastrarAluno(nomes, matriculas, cursos, input, quantidadeAlunos);
                    break;
                case 2:
                    listarAlunos(nomes, matriculas, cursos, quantidadeAlunos);
                    break;
                case 3:
                    System.out.print("Digite a matrícula do aluno a ser buscado: ");
                    int matriculaBusca = input.nextInt();
                    input.nextLine(); 
                    buscarAluno(nomes, matriculas, cursos, matriculaBusca, quantidadeAlunos);
                    break;
                case 4:
                    System.out.print("Digite a matrícula do aluno a ser removido: ");
                    int matriculaRemocao = input.nextInt();
                    input.nextLine(); 
                    removerAluno(nomes, matriculas, cursos, matriculaRemocao, quantidadeAlunos);
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        input.close();

}

    public static void listarAlunos(String[] nomes, int[] matriculas, String[] cursos, int quantidadeAlunos) {

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Matrícula: " + matriculas[i]);
            System.out.println("Curso: " + cursos[i]);
        }
    }
        
    public static void removerAluno(String[] nomes, int[] matriculas, String[] cursos, int matricula, int quantidadeAlunos) {

        for (int i = 0; i < quantidadeAlunos; i++) {
            if (matriculas[i] == matricula) {
                nomes[i] = null;
                matriculas[i] = 0;
                cursos[i] = null;
                System.out.println("Aluno removido com sucesso.");
                return;
            } else {
                System.out.println("Aluno não encontrado.");
            }
        }
    }

    public static void buscarAluno(String[] nomes, int[] matriculas, String[] cursos, int matricula, int quantidadeAlunos) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (matriculas[i] == matricula) {
                System.out.println("Aluno encontrado:");
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Matrícula: " + matriculas[i]);
                System.out.println("Curso: " + cursos[i]);  
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public static int cadastrarAluno(String[] nomes, int[] matriculas, String[] cursos, Scanner input, int quantidadeAlunos) {
        System.out.print("Digite o nome do aluno: ");
        nomes[quantidadeAlunos] = input.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        matriculas[quantidadeAlunos] = input.nextInt();
        input.nextLine(); 
        System.out.print("Digite o curso do aluno: ");
        cursos[quantidadeAlunos] = input.nextLine();
        System.out.println("Aluno cadastrado com sucesso.");
        return quantidadeAlunos + 1;
    }

}
