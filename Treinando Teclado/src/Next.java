import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();

        //System.out.print("Digite seu segundo nome:");
        //String sobrenome = scanner.next();

        System.out.println("Nome completo:" + nome);

        scanner.close();
    }
}
