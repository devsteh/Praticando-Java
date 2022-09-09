package praticandojava1;

import java.util.Scanner;//Biblioteca para entrada de dados pelo usuário

public class TiposPrimitivos2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); //Entrada de dado tipo String
        System.out.println("Digite a nota do aluno");
        float nota = teclado.nextFloat(); //Entrada de dado do tipo Float
        System.out.printf("A nota de(a) %s é %.1f",nome, nota);
    }
}
