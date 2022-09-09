package praticandojava1;

import javax.swing.*;

public class TesteTipos3 {
    public static void main(String[] args) {
        /*int idade = 30;
        String valor = Integer.toString(idade);//convertendo a idade em string para que o valor seja atribuído com o método .toString()
        System.out.println(valor);*/

        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);//Fazendo a conversão inversa(de String para int com o método .parseInt()
    }
}
