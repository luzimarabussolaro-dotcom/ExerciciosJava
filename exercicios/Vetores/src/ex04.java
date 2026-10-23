import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new
                Scanner(System.in);

        String[] cores = {
                "vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"
        };
        boolean[] acertouCor = new boolean[7];

        int acertos = 0;
        int erros = 0;
        boolean desistiu = false;

        while (acertos < 7 && !desistiu) {
            System.out.print("Digite uma cor do arco-iris ou 'sair': ");
            String resposta = sc.nextLine().trim();

            if (resposta.equalsIgnoreCase("sair")) {
                desistiu = true;
            } else {
                boolean encontrou = false;

                for (int i = 0; i < cores.length; i++) {
                    if (resposta.equalsIgnoreCase(cores[i])) {
                        encontrou = true;
                        if (!acertouCor[i]) {
                            acertouCor[i] = true;
                            acertos++;
                            System.out.println("Acertou!");
                        } else {
                            System.out.println("Voce ja acertou essa cor!");

                        }
                        break;

                    }
                }
                if (!encontrou) {
                    erros++;

                    System.out.println("Errou! Essa cor nao esta no arc0-iris.");
                }
            }

            System.out.println("Acertos: " + acertos);
            System.out.println("Erros:" + erros);
            System.out.println();
        }

        if (acertos == 7) {

            System.out.println("Parabens! Voce acertou todas as cores!");
        } else {

            System.out.println("Voce desistiu do jogo.");
        }

        sc.close();
    }

}