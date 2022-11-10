package Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {

    public static int Menu(){   

        Scanner scanner = new Scanner(System.in);
        int EscolhaMenu;

        System.out.println("1 – Cadastrar Produto");
        System.out.println("2 – Consultar estoque");
        System.out.println("3 – Remover unidades");
        System.out.println("4 – Adicionar unidades");
        System.out.println("9 - Sair");
        
        System.out.println("\nDigite o valor desejado: ");
        EscolhaMenu = scanner.nextInt();

        return EscolhaMenu;
    }

    public static void main(String[] args) {

        int EscolhaMenu = 0;

        Scanner scanner = new Scanner(System.in);

        ArrayList<produto> listaDeProdutos = new ArrayList <produto>();

        produto produtoUm = new produto("Nescau", 12.40, 15);
        produto produtoDois = new produto("Arroz", 6.59, 20);
        produto produtoTres = new produto("Café em pó", 11.00, 10);
        produto produtoQuatro = new produto("Chocolate", 7.99, 8);
   
        listaDeProdutos.add(produtoUm);
        listaDeProdutos.add(produtoDois);
        listaDeProdutos.add(produtoTres);
        listaDeProdutos.add(produtoQuatro);

        while(EscolhaMenu != 9){

            String nome;
            double valor;
            int quantidade, codigoDoProduto;

            EscolhaMenu = Menu();

            switch (EscolhaMenu) {
                case 1:
                    System.out.println("\nNome do produto: ");
                    nome = scanner.nextLine();
                    System.out.println("\nValor: ");
                    valor = scanner.nextDouble();
                    System.out.println("\nQuantidade: ");
                    quantidade = scanner.nextInt();

                    produto produtoN = new produto(nome, valor, quantidade);
                    listaDeProdutos.add(produtoN);

                    break;

                 case 2:
                    System.out.println("Código do produto: ");
                    codigoDoProduto = scanner.nextInt();

                    System.out.println("\n" + listaDeProdutos.get(codigoDoProduto).toString() + "\n");

                    break;

                case 3:
                    System.out.println("Código do produto: ");
                    codigoDoProduto = scanner.nextInt();

                    System.out.println("Quantidade a ser removida: ");
                    quantidade = scanner.nextInt();

                    if(listaDeProdutos.get(codigoDoProduto).verificarDispobilidade(quantidade) == true){
                        listaDeProdutos.get(codigoDoProduto).removerUnidades(quantidade);
                        System.out.println("Unidades removidas com sucesso!");
                    } else {
                        System.out.println("Produto não teve as unidades removidas, pois a quantidade é menor do que a informada.");
                    }

                    break;

                case 4:
                    System.out.println("Código produto: ");
                    codigoDoProduto = scanner.nextInt();

                    System.out.println("Quantidade a ser adicionada: ");
                    quantidade = scanner.nextInt();

                    listaDeProdutos.get(codigoDoProduto).adicionarUnidades(quantidade);
                    System.out.println("Quantidade adicionada com sucesso!");

                    break;

                default: 

                    System.out.println("Opção Inválida\n");
            }
        }
        scanner.close();
    }
}
