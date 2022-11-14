public class atividade5 {
    public static void main(String[] args) {
        String palavraChave = "atrapalham atrapalham";
        int contador = 2;

        System.out.println("1 Java atrapalha muita gente");

        for(contador = 2; contador <= 100; contador++) {
            System.out.println(contador + " Java " + palavraChave + " muita gente");
            palavraChave = palavraChave + " atrapalham";
        }
    }
}
