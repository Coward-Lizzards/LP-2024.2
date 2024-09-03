import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner((System.in));
        do {
            System.out.println("Para comprar blusa [1], Para solicitar valor [2]");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Ótima Escolha!");
                    break;
                case 2:
                    System.out.println("O valor da blusa é R$200,00");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
            }while(r==0);
    }
}