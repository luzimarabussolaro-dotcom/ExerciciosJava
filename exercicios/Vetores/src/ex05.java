import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int[] limites = {0, 55, 65, 75, 85, 100};

        String[] categorias = {
                "pena", "leve", "medio", "meio pesado", "super pesado"
        };

        System.out.print("Digite o peso do lutador em kg: ");
        int peso = sc.nextInt();

        int posicao = -1;

        for (int i = 0; i < limites.length; i++) {
            if (peso >= limites[i]) {
                posicao = i;
            }
        }
        if (posicao == -1)
        {
            System.out.println("Peso invalido!");
        } else {
            System.out.println("Categoria: " + categorias[posicao]);
        }
    }
}
