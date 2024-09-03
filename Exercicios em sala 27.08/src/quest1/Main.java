package quest1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Funcionario f = new Funcionario();

        int r;
        do{
            System.out.println("Insira seu Nome");
            f.nome = sc2.nextLine();

            System.out.println("Insira sua Matrícula");
            f.matricula = sc.nextInt();

            System.out.println("Insira seu Salário");
            f.salario = sc2.nextDouble();

            f.calcInss(f.salario);
            f.calcLiq(f.salario);

            System.out.printf("Nome: ",f.nome,"\nMatrícula: ",f.matricula,"\nSalário Bruto: %.2f",f.salario,"\nDedução INSS: %.2f",f.inssDesconto,"\nSalário Líquido: %.2f", f.salLiq);


            System.out.printf("Para repetir[0]");
            r = sc.nextInt();
        }while(r==0);
    }
}
