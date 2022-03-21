public class Questao9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Implementar um programa que dado um array imprime true se a soma dos seus elementos for positiva ou false, caso contrário");
        double[] numeros = {1,2,3,4,6};
        double soma = -2;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            if (soma >= 0) {
                System.out.println("True");
            }else{
                System.out.println("False");
                
            }
        }
    }
}
