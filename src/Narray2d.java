import java.util.Date;

public class Narray2d {
    private int array2d[][];
    private int sizeI;
    private int sizeJ;
    public Narray2d() {
        this.sizeI = 3;
        this.sizeJ = 3;
        this.array2d = new int[this.sizeI][this.sizeJ];
        for (int i = 0; i < this.array2d.length; i++) {
            for (int j = 0; j < this.array2d[i].length; j++) {
                this.array2d[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public Narray2d(int x) {
        this.sizeI = x;
        this.sizeJ = x;
        this.array2d = new int[this.sizeI][this.sizeJ];
        for (int i = 0; i < this.array2d.length; i++) {
            for (int j = 0; j < this.array2d[i].length; j++) {
                this.array2d[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public Narray2d(int y, int x) {
        this.sizeI = y;
        this.sizeJ = x;
        this.array2d = new int[this.sizeI][this.sizeJ];
        for (int i = 0; i < this.array2d.length; i++) {
            for (int j = 0; j < this.array2d[i].length; j++) {
                this.array2d[i][j] = (int)(Math.random()*100);
            }
        }
    }

    public Narray2d(int size, String string) {
        this.sizeI = size;
        this.sizeJ = size;
        this.array2d = new int[this.sizeI][this.sizeI];
        if (string.equals("S")) {
            int count = 1;
            for (int i = 0; i < this.array2d.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < this.array2d[i].length; j++) {
                        this.array2d[i][j] = count;
                        count++;
                    }
                } else {
                    for (int j = this.array2d[i].length - 1; j > -1; j--) {
                        this.array2d[i][j] = count;
                        count++;
                    }
                }
            }
        } else if (string.equals("O")) {
            int count = 1;
            for (int i = 0; i < size/2; i++) {
                for (int j = i; j < size - 2; j++) {
                    this.array2d[i][j] = count++;
                }
                
            }
        }
    }

    String showArray() {
        String str = new String();
        for (int i = 0; i < this.array2d.length; i++){
            for (int j = 0; j < this.array2d[i].length; j++){
                str += String.format("%3d ", this.array2d[i][j]);
            }
            str += "\n";
        }
        return str;
    }

    String minAndMax(){
        String str = new String();
        int min = this.array2d[0][0];
        int max = this.array2d[0][0];
        String minRepeat = new String();
        String maxRepeat = new String();
        long timeStartSearch = System.currentTimeMillis();
        for (int i = 0; i < this.array2d.length; i++) {
            for (int j = 0; j < this.array2d[i].length; j++) {
                if (min == this.array2d[i][j]) {
                    minRepeat += i + ":" + j + " ";
                }
                if (max == this.array2d[i][j]) {
                    maxRepeat += i + ":" + j + " ";
                }
                if (array2d[i][j] < min) {
                    min = this.array2d[i][j];
                    minRepeat = i + ":" + j + " ";
                }
                if (array2d[i][j] > max) {
                    max = this.array2d[i][j];
                    maxRepeat = i + ":" + j + " ";
                }
            }
        }
        long timeEndSearch = System.currentTimeMillis();
        str = "Минимальное значение - " + min + ", в индексах " + minRepeat + ".\n"
                + "Максимальное значение - " + max + ", в индексах " + maxRepeat + ".\n"
                + "Время выполнения поиска - " + (timeEndSearch - timeStartSearch) + " мсек.";
        return str;
    }
}
