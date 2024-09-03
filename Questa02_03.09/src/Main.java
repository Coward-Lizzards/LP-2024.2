import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Pessoa p = new Pessoa();


        System.out.println("Nome:");
        p.setNome(sc2.nextLine());


        System.out.println("Peso:");
        p.setPeso(sc.nextDouble());


        System.out.println("Altura:");
        p.setAltura(sc.nextDouble());

        p.calcIMC();

        System.out.println("Nome: "+ p.getNome());

        System.out.printf("IMC: %.2f", p.getImc());

    }
}