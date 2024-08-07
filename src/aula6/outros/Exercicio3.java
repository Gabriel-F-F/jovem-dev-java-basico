package aula6.outros;

public class Exercicio3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        for (Calculadora2Enum operacao : Calculadora2Enum.values()) {
            int resultado = operacao.executarOperacao(a, b);
            System.out.println(operacao.getNome() + ": " + a + " e " + b + " = " + resultado);
        }
    }
}