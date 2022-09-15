/*exemplo de estrutura condicional encadeada com situação de idade para votação.
* else if reduz a estuturação das condições em uma única linha para evitar quebras desnecessárias.
 */
package condicionalencadeada;

import java.util.Scanner;

public class IdadeVotacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nasc, idade;
        System.out.println("Digite o ano do seu nascimento: ");
        nasc = entrada.nextInt();
        idade = 2022 - nasc;
        System.out.println(idade+ " anos.");
        if(idade < 16){
            System.out.println("Voto não obrigatório.");
        }else if (idade>= 16 && idade <18 || idade>70) {
            System.out.println("Voto opcional.");
        } else{
            System.out.println("Voto obrigatório.");
        }
    }
}
