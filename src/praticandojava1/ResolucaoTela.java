package praticandojava1;
/*Obtendo idioma do sistema operacional em Java, através da classe java.awt e métodos
Toolkit.getDefaultToolkit().getScreenSize()*/
import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Resolução da tela: " + lar + " x " + alt);
    }
}
