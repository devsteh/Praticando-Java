package praticandojava2;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;

        System.out.println("A média é igual a "+m);*/

        /*int numero = 10;
        int valor = 4 + numero --;
        System.out.println(valor);
        System.out.println(numero);*/

        /*int x = 4;
        x += 2; //x = x + 2
        System.out.println(x);*/

        /*float n = 7.3f;
        int ar = (int) Math.round(n);
        System.out.println(ar);*/

        double ale = Math.random();//gerador de números aleatórios
        int n = (int) (1 + ale *  (100-1));
        System.out.println(n);
    }
}
