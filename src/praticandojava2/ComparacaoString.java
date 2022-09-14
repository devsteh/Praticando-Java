package praticandojava2;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Stephany";
        String nome2 = "Stephany";
        String nome3 = new String ("Stephany");/*O conteúdo das variáveis são iguais, porem a
        estrutura são diferentes devido a instanciação com new.*/
        //String res = (nome1==nome2)?"igual":"diferente";
        String res = (nome1.equals(nome3))?"igual":"diferente";/*.equals é um método que verifica se o valor de um objeto é igual a outro.
        Não será usado ==, mas sim o .equals*/
        System.out.println(res);
    }
}
