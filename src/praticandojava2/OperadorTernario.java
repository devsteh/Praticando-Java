package praticandojava2;
/*Operadores ternários atribuem um único valor para uma mesma variável
 através de comparações*/
public class OperadorTernario {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 4;
        //int resultado = (n1>n2)?0:1;
        int resultado = (n1>n2)?n1:n2;
        System.out.println(resultado);
    }
}
