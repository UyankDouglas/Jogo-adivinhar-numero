import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gerador de numeroDigitado aleatorio");
        System.out.println();

        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 6) {

            System.out.println("Digite um numero entre 0 e 100 e tente acertar.");
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio){
                System.out.println("Acertou!");
                break;
            }else if (numeroDigitado < numeroAleatorio){
                System.out.println("Errou, tente um numero maior");
            }else {
                System.out.println("Errou, tente um numero menor");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroAleatorio){
            System.out.println("Você não acertou o numero gerado em 5 tentaivas, o numero era: " + numeroAleatorio);
        }

    }
}