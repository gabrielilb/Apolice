public class atividade10 {    
    
    public static int tamanho = 4;
    public static void main (String[] args) {
        int[][] n = new int[tamanho][tamanho];
        int contador = 1, soma = 0;

        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                n[i][j] = 1 + (int) (Math.random() * 9);
                System.out.print(n[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                if(i == contador && j < i){
                    System.out.print(i + "" + j + " = " + n[i][j] + "  ");
                    soma += n[i][j];
                }
            }
            contador++;
        }
        System.out.println();
        System.out.println(soma);
    }
}
