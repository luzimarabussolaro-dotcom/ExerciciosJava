import java.util.Scanner;
/*-------------------------------------------------------------------
  x 1.4: Ovos das galinhas
  - calcular quantas caixas de ovos cheias podem ser levadas ao mercado
  - calcular quantos ovos sobram

  TAREFA:
  - peça para o usuário informar quantos ovos suas galinhas botaram no dia
  - considere que cada caixa comporta 12 ovos
  - calcule e imprima quantas caixas cheias ele poderá levar ao mercado
  - calcule e imprima quantos ovos sobram
  - use a operação de divisão inteira (/) e resto da divisão (%)
-------------------------------------------------------------------*/
public class Ex01_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a quantidade de ovos que Doroteia ponhou: ");
        int qtdOvos = scanner.nextInt();

        int caixas = qtdOvos / 12;
        int resto = qtdOvos % 12;
        System.out.printf("Você pode levar " + caixas + " caixas no mercado. Sobraram" + resto + " ovos!");

    }
}
