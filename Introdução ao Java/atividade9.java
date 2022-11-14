public class atividade9 {
    public static void main(String[] args) {

        int[] numeros = new int[50];
        int soma = 0, contador = 0;
        float media = 0;

        for(int i = 0; i < 50; i++){
            numeros[i] = 1 + (int) (Math.random() * 100);
            soma += numeros[i];
        }
    
        media = soma / 50;
        soma = 0;
        for(int i = 0; i < 50; i++){
            if(numeros[i] < media){
                soma += numeros[i];
                contador++;
            }
        }
        media = soma / contador;
        System.out.println(media);
    }
}