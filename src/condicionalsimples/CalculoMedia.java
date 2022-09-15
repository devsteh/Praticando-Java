package condicionalsimples;

import java.util.Scanner;

//Cálculo de média com a entrada pelo usuário e condição de aprovação e reprovação.
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//System.in = o programa vai carregar a entrada do sistema.
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float media = (n1+n2)/2;
        if (media > 6){
            System.out.println("Parabéns "+nome+ " você foi aprovado com média "+media);
        }else{
            System.out.println(nome+" Sua média foi "+media+ " infelizmente você foi reprovado(a)");
        }
    }
}
