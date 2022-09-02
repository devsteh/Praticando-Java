package praticandojava1;
/*Obtendo idioma do sistema operacional em Java, através da classe java.util e método getDefault*/
import java.util.*;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma do sistema: "+idioma.getDisplayLanguage());
        System.out.println("Sigla do idioma do sistema: "+idioma.getLanguage());
    }
}
