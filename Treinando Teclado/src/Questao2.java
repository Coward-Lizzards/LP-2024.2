import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;
        do{
            System.out.println("Digite sua matrícula:");
            int matricula = sc.nextInt();

            System.out.println("Digite seu Nome Completo:");
            String nome = sc2.nextLine();

            System.out.println("Digite seu salário bruto:");
            double salario = sc.nextDouble();

            double liquido = salario - (salario * 0.15);
            double inss = salario * 0.15;

            System.out.println("Matrícula: " + matricula + "\nNome: " + nome );
            System.out.println(String.format("Salario: %.2f", salario), ("Dedução do INSS: %.2f" + inss), ("Salário Líquido: %.2f" + liquido),

            System.out.print("Para repetir digite [S]"),
            r = sc.next();
        }while(r.equalsIgnoreCase("S"));
    }
}
