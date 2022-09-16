//o break é um comando que para o laço, que ao último comando antes dele, joga o comando para fora do laço.
package enquantowhile;

public class Cambalhota3 {
    public static void main(String[] args) {
        int contCambalhota = 0;
        while(contCambalhota < 10){
            contCambalhota++;
            if (contCambalhota == 2 || contCambalhota == 3 || contCambalhota == 4){
                continue;
            }
            if (contCambalhota == 7){
                break;
            }
            System.out.println("Cambalhota " + contCambalhota);
        }
    }
}
