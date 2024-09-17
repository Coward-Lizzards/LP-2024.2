public class Professor(String nome) extends Pessoa{
    super(nome);

    double Salario;
    double inssPercent = 0.15;
    double inssDesconto;
    double salLiq;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getInssPercent() {
        return inssPercent;
    }

    public void setInssPercent(double inssPercent) {
        this.inssPercent = inssPercent;
    }

    public double getInssDesconto() {
        return inssDesconto;
    }

    public void setInssDesconto(double inssDesconto) {
        this.inssDesconto = inssDesconto;
    }

    public double getSalLiq() {
        return salLiq;
    }

    public void setSalLiq(double salLiq) {
        this.salLiq = salLiq;
    }
    public void calcInss(double x){
        double inss = salario * inssPercent;
        inssDesconto = inss;
    }

    public void calcLiq(double x){
        double liquido = salario - inssDesconto;
        salLiq = liquido;
    }
}

public class Professor extends Pessoa{

    double Salario;
    double inssPercent = 0.15;
    double inssDesconto;
    double salLiq;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getInssPercent() {
        return inssPercent;
    }

    public void setInssPercent(double inssPercent) {
        this.inssPercent = inssPercent;
    }

    public double getInssDesconto() {
        return inssDesconto;
    }

    public void setInssDesconto(double inssDesconto) {
        this.inssDesconto = inssDesconto;
    }

    public double getSalLiq() {
        return salLiq;
    }

    public void setSalLiq(double salLiq) {
        this.salLiq = salLiq;
    }
    public void calcInss(double x){
        double inss = salario * inssPercent;
        inssDesconto = inss;
    }

    public void calcLiq(double x){
        double liquido = salario - inssDesconto;
        salLiq = liquido;
    }
}

