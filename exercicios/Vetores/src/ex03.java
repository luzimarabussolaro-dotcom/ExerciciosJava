import java.util.Scanner;

public class ex03 {
    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quqntas notas deseja digitar?");
        int quantidade = entrada.nextInt();

        double[] notas = new double[quantidade];

        for(int i=0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) +":");
                    notas[i] = entrada.nextDouble();
        }
        double soma = 0;

        System.out.println("\nNotas digitais:");

        for (int i = 0;i < notas.length;i++){
    System.out.println(notas[i]);
    soma = soma + notas[i];
}

double media = soma/ notas.length;

System.out.println("Media final:" + media);

entrada.close();
}
}