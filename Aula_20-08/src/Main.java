import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int r ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Para comprar[1], Para solicitar o valor[2], Para falar com atendente[3]");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Ótima escolha!");
                    break;
                case 2:
                    System.out.println("O valor da blusa é R$ 200,00");
                    break;
                case 3:
                    System.out.println("Falar com Atendente");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
            System.out.print("Para repetir, digite 0");
            r = sc.nextInt();
            }while(r==0);
    }
}