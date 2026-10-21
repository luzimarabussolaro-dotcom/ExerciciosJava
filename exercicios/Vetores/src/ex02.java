import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] empresas = {
                "Dr. Silva, Dentista",
                "Contabilidade Silva",
                "Dr. Silva, cardiologista",
                "Silvana Silva, Manicure",
                "Silva & Silva Advogados Associados"};
        System.out.print("Digite o numero do escritorio (101 a 105): ");
        int numero = entrada.nextInt();

        int posicao = numero - 101;

        if (posicao >= 0 && posicao < empresas.length) {

            System.out.println("Empresa: " + empresas[posicao]);

        } else {
        System.out.println("Entrada invalida! Digite um numero entre 101 a 105.");
    }
    entrada.close();
        }
    }
