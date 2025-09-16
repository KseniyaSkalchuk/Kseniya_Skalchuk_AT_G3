import java.util.Random;

public class ForEach {
public static void main(String[] args) {
        foreach();
    }

    static void foreach() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("initial array: ");
        for (int i : array) {
            System.out.println(i + "");
        }
        System.out.println();
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        System.out.println("Average value is : " + avg);
    }

}


