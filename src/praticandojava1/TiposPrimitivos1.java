package praticandojava1;
//Trabalhando com tipos de variáveis.

public class TiposPrimitivos1 {
    public static void main(String[] args) {
        float nota = 8.5f;
        //float nota = (Float) 8.5f; Typecast
        //Float nota = new Float(8.5); Wrapper Class - Cria um objeto
        System.out.println("A nota é "+nota);
        System.out.printf("A nota é %.2f ",nota);//Concatenação com format. Sempre especificar o tipo de dado da variável
    }
}
