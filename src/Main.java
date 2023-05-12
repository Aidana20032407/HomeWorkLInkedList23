import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integers1.add(random.nextInt(0, 2));
        }
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(0, 2));

        }
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 2);
        }
        System.out.println(Arrays.toString(integers(mass)));
    }

    public static int[] integers(int[] array) {
        //Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static ArrayList<Integer> integers1(ArrayList<Integer> integers1) {
        Collections.sort(integers1);
        return integers1;
    }

    public static LinkedList<Integer> integers2(LinkedList<Integer> integers2) {
        Collections.sort(integers2);
        return integers2;
    }

}





























