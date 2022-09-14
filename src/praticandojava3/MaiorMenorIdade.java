package praticandojava3;

import javax.swing.*;
import java.util.Scanner;

//Cálculo de idade com estrutura condicional e entrada pelo usuário.
public class MaiorMenorIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nasc, idade;
        System.out.println("Digite o ano do nascimento.");
        nasc = teclado.nextInt();
        idade = 2022 - nasc;
        if (idade >= 18) {
            System.out.println("Maior de idade = "+idade+ " anos");
        }else{
            System.out.println("Menor de idade = "+idade+ " anos");
        }

    }
}
