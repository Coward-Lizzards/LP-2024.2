import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        String r;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        do{
            System.out.print("Digite seu nome:");
            String nome = sc2.nextLine();

            System.out.print("Digite sua idade:");
            int idade = sc.nextInt();


            System.out.println("Nome: " + nome + "\nIdade: " + idade );

        System.out.print("Para repetir digite [S]");
        r = sc.next();
        }while(r.equalsIgnoreCase("S"));
    }
}
