package facado;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Digite um número:");
            n = entrada.nextInt();
            s +=n; //s = s +n;
            System.out.println("Quer continuar? [S/N]");
            resp = entrada.next();
        }while (resp.equals("S"));
        System.out.println("A soma de todos os valores é: "+s);
    }
}
