import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Pessoa p = new Pessoa();


    System.out.println("Seu Nome: ");
    p.setNome(sc2.nextLine());

    System.out.println("Sua Idade: ");
    p.setIdade(sc.nextInt());

    System.out.println("Seu Salario: ");
    p.setSalario(sc.nextDouble());


    System.out.println("Nome: "+p.getNome());
    System.out.println("Idade: "+p.getIdade());
    System.out.println("Salario: "+p.getSalario());
    }
}