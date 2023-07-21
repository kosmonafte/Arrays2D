import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*30 - 10);
        }
        System.out.println(Arrays.toString(array));
        int maxSteps = 0;
        int position = 0;
        int tmpJ = 0;

        // Первый вариант - "ничего лишнего"

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                int steps = 0;
                for (int j = i; j < array.length; j++) {
                    if (array[j] > 0) {
                        steps++;

                    } else {
                        break;
                    }
                }
                if (steps > maxSteps) {
                    maxSteps = steps;
                    position = i;
                }
            }
        }

        // Второй вариант с прыжками, на очень больших массивах работать должен быстрее

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                int steps = 0;
//                for (int j = i; j < array.length; j++) {
//                    if (array[j] > 0) {
//                        steps++;
//                        if (j == array.length - 1) {
//                            tmpJ = j;
//                            break;
//                        }
//                    } else {
//                        tmpJ = j;
//                        break;
//                    }
//                }
//                if (steps > maxSteps) {
//                    maxSteps = steps;
//                    position = i;
//                }
//                i = tmpJ;
//                System.out.println(i);
//            }
//        }

        int arrayRes[] = new int[maxSteps];
        System.arraycopy(array, position, arrayRes, 0, maxSteps);
        System.out.println(maxSteps);
        System.out.println(Arrays.toString(arrayRes));
    }
}
