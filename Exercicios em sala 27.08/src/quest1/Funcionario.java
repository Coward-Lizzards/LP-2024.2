package quest1;

public class Funcionario {
    int matricula;
    String nome;
    double salario;
    double inssPercent = 0.15;
    double inssDesconto;
    double salLiq;

    public void calcInss(double x){
        double inss = salario * inssPercent;
        inssDesconto = inss;
    }

    public void calcLiq(double x){
        double liquido = salario - inssDesconto;
        salLiq = liquido;
    }
}
