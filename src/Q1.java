import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add(rand.nextInt((50) + 1));
        }
        System.out.println(arrList);
        System.out.println("Give me a number");
        int aNum = input.nextInt();
        if (arrList.contains(aNum)) {
            System.out.println("The number is in the list.");
        } else {
            System.out.println("The number is not in the list.");
        }
        input.close();
    }
}