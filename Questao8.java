public class Questao8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Implementar programa que soma todos os elementos de um array");
        double[] numeros = {12,13,19,5,7};
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ìndice: "  + i + " Número: " + numeros[i]);
            soma += numeros[i];
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
