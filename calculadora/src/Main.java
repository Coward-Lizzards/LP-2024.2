import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        int r;
        do{

            int n1,n2;
            System.out.println("Primeiro numero:");
            n1 = sc.nextInt();

            System.out.println("Segundo numero:");
            n2 = sc.nextInt();


            System.out.println("Escolha a operação");
            System.out.println("Somar[1],Subtrair[2],Multiplicar[3],Dividir[4]");

            int x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println(c.somar(n1,n2));
                    break;
                case 2:
                    System.out.println(c.subtract(n1,n2));
                    break;
                case 3:
                    c.multiply(n1,n2);
                    break;
                case 4:
                    c.divide(n1,n2);
            }
            System.out.println("Para fazer outro calculo [0]");
            r = sc.nextInt();
        }while(r == 0);



    }
}