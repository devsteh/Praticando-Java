//Modificação de fluxo de laço: Mudar a ordem natural de repetição.
package enquantowhile;

public class Cambalhota2 {
    public static void main(String[] args) {
        int contCambalhota = 0;
        while (contCambalhota<10){
            contCambalhota++;
            if (contCambalhota == 5 || contCambalhota ==7){
                continue;/*nessa condição, o programa ao
                reconhecer os números 5 e 7 pulam eles, voltando pro início da condição para dar continuidade no comando até o limite especificado no laço.*/
            }
            System.out.println("Cambalhota "+ contCambalhota);
        }
    }
}
