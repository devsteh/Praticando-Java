/* O switch case é uma estrutura construida para interação de forma mais
intuitiva no programa, a fim de reduzir blocos de código excessivos com estruturas encadeadas.
* */
package condicionalmultiplaescolha;

import java.util.Scanner;

public class Pernas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantas pernas você tem. 1,2,4,6,8 ou 0 para outro: ");
        int pernas = entrada.nextInt();
        switch(pernas){
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bípede");
                break;
            case 4:
                System.out.println("Quadrúpede");
                break;
            case 6,8:
                System.out.println("Aranha");
                break;
            case 0:
                System.out.println("ET!!!");
        }

    }
}
