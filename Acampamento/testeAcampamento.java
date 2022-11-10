import java.util.Scanner;

public class testeAcampamento {

    public static Acampamento[] acp = new Acampamento[10];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha as informações abaixo: ");
    
        for(int i = 0; i < acp.length; i++){

            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            acp[i] = new Acampamento(nome, idade);
            acp[i].definirEquipe();
        }
        scanner.close();

        for(int i = 0; i < acp.length; i++){
            System.out.println(acp[i].toString());
        }

    }
}
