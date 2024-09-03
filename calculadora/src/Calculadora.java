public class Calculadora {
    int total;

    public int somar(int x, int y){
        total = x + y;
        return total;
    }

    public int subtract(int x, int y) {
        total = x - y;
        return total;
    }

    public void multiply(int x, int y) {
        total = x * y;
        System.out.println(total);
    }

    public void divide(int x, int y) {
        total = x / y;
        System.out.println(total);
    }
}
