import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno("João", 12345);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.println("Digite a matrícula: ");
        int matriculaAluno = sc.nextInt();

        Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
    }
}