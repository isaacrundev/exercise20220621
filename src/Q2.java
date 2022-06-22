import java.util.ArrayList;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arrList2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList2.add(rand.nextInt((50) + 1));
        }
        ArrayList<Integer> copied = new ArrayList<>(arrList2);
        arrList2.remove(9);
        arrList2.add(-5);
        // copied.set(9, -5);
        System.out.println("The orignal array: " + arrList2);
        System.out.println("The cloned array: " + copied);

    }
}
