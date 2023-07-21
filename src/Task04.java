import java.io.CharArrayReader;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*855 - 300);
        }
        int negative[] = new int[array.length];
        int positive[] = new int[array.length];
        int result[] = new int[array.length];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive[positiveCount] = array[i];
                positiveCount++;
            } else if (array[i] < 0) {
                negative[negativeCount] = array[i];
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        int zero[] = new int[zeroCount];
        System.arraycopy(positive, 0, result, 0, positiveCount);
        System.arraycopy(negative, 0, result, zeroCount + positiveCount, negativeCount);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }
}
