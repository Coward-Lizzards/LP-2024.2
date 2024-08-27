import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int r ;

        Pessoa p = new Pessoa();

        do {
            //Scanner idade
            Scanner keyB = new Scanner(System.in);
            System.out.println("Entre sua Idade:");
            p.idade = keyB.nextInt();
            System.out.println(p.idade);

            //Scanner nome
            Scanner keyBb = new Scanner(System.in);
            System.out.println("Entre seu Nome:");
            p.nome = keyBb.nextLine();
            System.out.println(p.nome);

            //Scanner salario
            System.out.println("Entre seu Salário:");
            p.salario = keyB.nextDouble();
            System.out.println(p.salario);


            //Metodo Idade
            System.out.println("Idade antiga: " + p.idade);
            p.niver();

            System.out.println("Idade Atual: " + p.idade);

            //Print nome e salario

            System.out.println("Nome: " + p.nome);
            System.out.println("Salario: " + p.salario);

            System.out.println("Para ver novamente [0]");
            r = keyBb.nextInt();

        }while (r == 0);

        }
    }
