public class Funcionario {

    //Nome
    private String nome;
    //salario
    private double valorHora,salario;

    //Hora Trabalhada
    private int horaTrabalhada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(int horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public double getSalario() {
        return salario;
    }
//CALC SALARIO

    public void calcSalario(){
       salario = valorHora * horaTrabalhada;

    }
}
