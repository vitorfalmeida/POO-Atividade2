package Classes;

public class Data {
  private int Dia;
  private int Mes;
  private int Ano;

  public Data(int dia, int mes, int ano) {
    Dia = dia;
    Mes = mes;
    Ano = ano;
  }

  public String MostraData() {
    return getDia() + "/" + getMes() + "/" + getAno();
  }

  public int getDia() {
    return Dia;
  }

  public void setDia(int dia) {
    Dia = dia;
    if (dia < 10) {
      
    }
  }

  

  public int getMes() {
    return Mes;
  }

  public void setMes(int mes) {
    Mes = mes;
  }

  public int getAno() {
    return Ano;
  }

  public void setAno(int ano) {
    Ano = ano;
  }

}
