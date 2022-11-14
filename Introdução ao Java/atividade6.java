public class atividade6 {
    public static void main(String[] args) {

        int numeros = 0;
        
        for(int i = 1; numeros < 15; i++) {
            int primos = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    primos++;
                }
            }
            if(primos == 2) {
                numeros++;
                System.out.println(i + " ");
            }
        }
    }
}
