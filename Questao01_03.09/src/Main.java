//Faça um programa que calcule o salário de um funcionário com base
//no valor da hora trabalhada de R$ 15.00 e na quantidade de
//40 horas trabalhadas e exiba o salário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Seu Nome:");
        f.setNome(sc2.nextLine());

        System.out.println("Seu valor da hora:");
        f.setValorHora(sc.nextDouble());

        System.out.println("Horas Trabalhadas:");
        f.setHoraTrabalhada(sc.nextInt());


        f.calcSalario();



        System.out.println("Nome: "+ f.getNome());
        System.out.println("Salario: "+ f.getSalario());

    }
}