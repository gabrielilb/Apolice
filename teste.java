import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Apolice p = new Apolice();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do segurado:");
        p.nomeSegurado = scanner.nextLine();
        System.out.println("Digite o nome da cidade:");
        p.cidade = scanner.nextLine();
        System.out.println("Digite a idade: ");
        p.idade = scanner.nextInt();
        System.out.println("Digite o valor do prêmio: ");
        p.valorPremio = scanner.nextFloat();

        p.calcularPremio();

        p.imprimir();

        System.out.println("Valor do desconto pela cidade: ");
        System.out.println(p.oferecerDesconto(p.cidade)); 
       
        System.out.println("Digite o nome do segurado:");
        scanner.nextLine();
        String nomeSegurado = scanner.nextLine();
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o valor do prêmio: ");
        float valorPremio = scanner.nextFloat();
        System.out.println("Digite a cidade: ");
        scanner.nextLine();
        String cidade = scanner.nextLine();
       
        Apolice a = new Apolice(nomeSegurado, idade, valorPremio);

        a.calcularPremio();

        a.imprimir();

        System.out.println("Desconto pela cidade: ");
        System.out.println(a.oferecerDesconto(cidade));

        System.out.println("O último número de apólice:  ");
        a.exibeUltimoNum();

        scanner.close();

    }
}
