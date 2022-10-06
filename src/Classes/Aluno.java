package Classes;


import java.text.DecimalFormat;

public class Aluno {
  // classe para formatar decimal
  DecimalFormat formatador = new DecimalFormat("0.00");
  private String Nome;
  private int Matricula;
  private double Nota1;
  private double Nota2;
  private double NotaTrabalho;
  private double Media;

  public Aluno(String nome, int matricula, double nota1, double nota2, double notaTrabalho) {
    Nome = nome;
    Matricula = matricula;
    Nota1 = nota1;
    Nota2 = nota2;
    NotaTrabalho = notaTrabalho;

  }

  public String toString() {
    return ("\nAluno: " + getNome() + "\nMatricula: " + getMatricula() + "\nNota prova 1: " + getNota1()
        + "\nNota prova 2: " + getNota2() + "\nNota do trabalho: " + getNotaTrabalho());
  }

  // Calculo da média ponderada
  public void media() {
    double media = ((getNota1() * 2.5) + (getNota2() * 2.5) + (getNotaTrabalho() * 2)) / (2.5 + 2.5 + 2);
    System.out.println("\nA média de " + getNome() + " é " + formatador.format(media));
    Media = media;

  }

  // Calculo de quanto precisa para prova final
  public void provaFinal() {
    if (getMedia() >= 6) {
      System.out.println(0);
    } 
    else if(getMedia() < 6 && getMedia() >=2) 
    {
      double falta = 12 - getMedia();
      System.out.println(getNome() + " Precisa tirar na prova final: " + formatador.format(falta));
    } 
    else
    {
      System.out.println("Infelizmente você reprovou direto!!");
    }

  }

  // GETERS e SETERS
  public String getNome() {
    return Nome;
  }

  public void setNome(String nome) {
    Nome = nome;
  }

  public int getMatricula() {
    return Matricula;
  }

  public void setMatricula(int matricula) {
    Matricula = matricula;
  }

  public double getNota1() {
    return Nota1;
    
  }

  public void setNota1(double nota1) {
      
    Nota1 = nota1;
  }

  public double getNota2() {
    return Nota2;
  }

  public void setNota2(double nota2) {
    Nota2 = nota2;
  }

  public double getNotaTrabalho() {
    return NotaTrabalho;
  }

  public void setNotaTrabalho(double notaTrabalho) {
    NotaTrabalho = notaTrabalho;
  }

  public double getMedia() {
    return Media;
  }

  public void setMedia(double media) {
    Media = media;
  }
}
