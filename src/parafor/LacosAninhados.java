/*Exemplo de execução de laços for aninhados. Após as atribuições dos laços, ao fazer o retorno no print,
* será feito primeiro o retorno para o laço de repetição de dentro(no caso o segundo feito),
* seguir o fluxo para depois processar o laço de fora*/
package parafor;

public class LacosAninhados {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            for(int j=0; j<=2; j+=2){
                System.out.println(i+ " - " +j);
            }
        }
    }
}
