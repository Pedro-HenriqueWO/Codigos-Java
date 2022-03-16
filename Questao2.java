import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {
    //Classificar o valor da média de um aluno como aprovado (> 6), reprovado (< 4) e recuperação (caso contrário)
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Insira sua primeira nota: ");
    double nota1 = leitor.nextDouble();
    System.out.println("Insira sua segunda nota: ");
    double nota2 = leitor.nextDouble();
    System.out.println("Insira sua terceira nota: ");
    double nota3 = leitor.nextDouble();
    System.out.println("Insira sua primeira nota: ");
    double nota4 = leitor.nextDouble();
    double media;
    media = (nota1 + nota2 + nota3+ nota4) / 4;
 
    if (media >= 6) {
        System.out.println("Parabéns, você foi aprovado!");
    }else if (media <= 4) {
        System.out.println("Você foi reprovado.");
    }else {
        System.out.println("Você foi pra recuperação");
    }

    }
}