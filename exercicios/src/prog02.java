import java.util.Scanner;
public class prog02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        double somaAlturas = 0;
        String continuar;

        do{
            System.out.println("Informe a altura: ");
            double altura = scanner.nextDouble();

            somaAlturas += altura;
            quantidade++;

            System.out.println("Deseja continuar? (Sim/Não):");
            continuar = scanner.next();

    }while (!continuar.equalsIgnoreCase("Não"));

    if (quantidade > 0) {
        double media = somaAlturas / quantidade; // Calculo da media

    System.out.println("\n--- Resultados---");
    System.out.println("Total de alturas informadas: " + quantidade);
    System.out.println("Soma de todas as alturas: " + somaAlturas + "m");
    System.out.printf("A média das alturas é: %.2fm\n",media);//Exibe com 2 casas decimais
}else {
    System.out.println("Nenhuma altura foi informada.");
}
scanner.close();
 }
}