public class Cinema {
    private int places[][];
    Cinema(int a, int b) {
        places = new int[a+1][b+1];
        for (int i = 0; i < a+1; i++) {
            this.places[i][0] = i;
        }
        for (int i = 0; i < b+1; i++) {
            this.places[0][i] = i;
        }
        for (int i = 1; i < places.length; i++) {
            for (int j = 1; j < places[i].length; j++) {
                places[i][j] = (int)(Math.random()*2);
            }
        }
    }
    public String showArray() {
        String str = new String();
        for (int i = 0; i < this.places.length; i++){
            for (int j = 0; j < this.places[i].length; j++){
                str += String.format("%2d ", this.places[i][j]);
            }
            str += "\n";
        }
        return str;
    }

    public String searchPlaces(int number){
        String str = new String();
        for (int i = 1; i < this.places.length; i++) {
            for (int j = 1; j < this.places[i].length; j++) {
                if (this.places[i][j] == 0) {
                    int count = 0;
                    String plcs = new String("Ряд - " + (i) + ". Места - ");
                    for (int k = j; k < this.places[i].length; k++) {
                        if (this.places[i][k] == 0) {
                            count++;
                            plcs += (k) + " ";
                            if (k == this.places[i].length -1) {
                                j = k;
                                break;
                            }
                        } else if (this.places[i][k] == 1 /*|| k == this.places[i].length -1*/){
                            j = k;
                            break;
                        }
                    }
                    if (count >= number) {
                        str += plcs + "\n";
                    }
                }
            }
        }
        return str;
    }
}
