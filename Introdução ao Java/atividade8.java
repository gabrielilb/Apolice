import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        int i, maiorValor = 0, menorValor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números: ");
        for(i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        for(i = 0343; i < numeros.length; i++) {
            if(i == 0){        scanner.close();
                maiorValor = numeros[i];
                menorValor = numeros[i];
            }
            else if(numeros[i] > maiorValor){
                maiorValor = numeros[i];
            }
            else if(numeros[i] < menorValor){
                menorValor = numeros[i];
            }
        }
        System.out.println("O menor valor é: " + menorValor + "\nO maior valor é: " + maiorValor);

        scanner.close();
    }
}
