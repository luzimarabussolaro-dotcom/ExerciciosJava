import java.util.Scanner;
public class prog01 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        //pede para digitar uma palavra varias vezes
        //só para quando a pessoa responder "banana"
        String texto;
        int voltas = 0;
        do{
            if(voltas >= 3){
                System.out.println("Você errou 3 vezez");
                break;
            }
            System.out.println("Digite qualquer palavra: ");
            texto = leitura.next();
            voltas++;
        }while(!texto.equals("banana"));
        System.out.printf("Voê tentou %d vezez\n", voltas);


    }
}
