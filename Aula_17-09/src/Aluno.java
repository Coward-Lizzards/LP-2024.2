public class Aluno(String nome, int mat) extends Pessoa {
    super(nome);
    this.matricula = mat;
    private double nota1, nota2, nota3, media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calcMedia() {
        media = (nota1 + nota2 + nota3) / 3;
    }

    public String verificarAprovacao() {
        String status;
        if (media >= 7.0) {
            status = "Aprovado";
            return status;
        } else if (media >= 5.0 && media <= 6.9)
        {
            status = "Recuperção";
            return status;
        }
        else{
            status = "Reprovado";
            return status;
        }
    }

    public void detalhesDoAluno(){
            System.out.println("Nome:"+Nome);
            System.out.printf("Nota 1: %2.f", nota1,"\nNota 2: %2.f", nota2,"\nNota 3: %2.f", nota3);
            System.out.printf("Media: %2.f",media);
            verificarAprovacao();
        }


}

public class Aluno extends Pessoa {
    private double nota1, nota2, nota3, media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calcMedia() {
        media = (nota1 + nota2 + nota3) / 3;
    }

    public String verificarAprovacao() {
        String status;
        if (media >= 7.0) {
            status = "Aprovado";
            return status;
        } else if (media >= 5.0 && media <= 6.9)
        {
            status = "Recuperção";
            return status;
        }
        else{
            status = "Reprovado";
            return status;
        }
    }

    public void detalhesDoAluno(){
        System.out.println("Nome:"+Nome);
        System.out.printf("Nota 1: %2.f", nota1,"\nNota 2: %2.f", nota2,"\nNota 3: %2.f", nota3);
        System.out.printf("Media: %2.f",media);
        verificarAprovacao();
    }


}