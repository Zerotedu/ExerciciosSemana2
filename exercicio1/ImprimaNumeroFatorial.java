package br.com.ntconsult.exerciciossemana2.exercicio1;

public class ImprimaNumeroFatorial {

    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        int numero = 4; // <-- Digite o número.
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
