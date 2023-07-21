import java.lang.reflect.Array;
import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*40 - 10);
        }
        System.out.println(Arrays.toString(array));
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative = i + 1;
                break;
            } else {
                negative = -1;
            }
        }
        int arrayRes[] = new int[array.length - 1 - negative];
        System.arraycopy(array, negative, arrayRes, 0, array.length - 1 - negative);
        System.out.println(Arrays.toString(arrayRes));
        int sum = 0;
        for (int i = 0; i < arrayRes.length; i++) {
            sum += arrayRes[i];
        }
        System.out.println(sum);
    }
}
