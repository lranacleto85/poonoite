import java.util.Arrays;

public class Exemplo3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Arrays.fill(vetor, 15);

        for(int x : vetor){
            System.out.println(x);
        }
    }

}
