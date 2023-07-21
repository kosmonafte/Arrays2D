import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int array[] = new int[200];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*200);
        }
        int oneDigit = 0;
        int twoDigit = 0;
        int threeDigit = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int tmp = array[i];
            while (tmp > 0) {
                tmp /= 10;
                count++;
            }
            if (count == 3) {
                threeDigit++;
            } else if (count == 2) {
                twoDigit++;
            } else {
                oneDigit++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Digit 1 = %d%%\nDigit 2 = %d%%\nDigit 3 = %d%%", oneDigit*100/200, twoDigit*100/200, threeDigit*100/200);
    }
}
