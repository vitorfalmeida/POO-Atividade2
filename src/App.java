import Classes.*;

public class App {
    public static void main(String[] args) {
        
        
        //Teste Questão 1 - Classe Aluno
        Aluno aluno01 = new Aluno("Vitor", 123456, -2, 5, 6);
        System.out.println(aluno01.toString());
        aluno01.media();
        aluno01.provaFinal();

        // Teste Questão 2 - Classe Data
        // Data data01 = new Data(9,3,1994);
        // System.out.println("\nA Data é: " + data01.MostraData());
    }
}
