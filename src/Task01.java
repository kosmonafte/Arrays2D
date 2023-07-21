import java.lang.reflect.Array;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int array[] = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.pow(i, 2);
        }
        System.out.println(Arrays.toString(array));
    }
}
