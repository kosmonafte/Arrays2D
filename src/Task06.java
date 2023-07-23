import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Narray2d array2 = new Narray2d(size);
        if (size < 201) {
            System.out.println(array2.showArray());
        } else {
            System.out.println("Массив слишком большой, вывод невозможен.");
        }
        System.out.println(array2.minAndMax());
    }
}
