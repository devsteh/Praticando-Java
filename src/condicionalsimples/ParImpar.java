package condicionalsimples;

import java.util.Scanner;

//Verificando se o número digitado é par ou impar.
public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Digite um número inteiro para saber se é par ou impar: ");
        numero = entrada.nextInt();
        if (numero%2 ==0){
            System.out.println("Número par");
        }else
            System.out.println("Número ímpar");
    }
}
