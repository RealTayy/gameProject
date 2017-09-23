import exceptions.OutOfRange;

import java.util.Random;

public class testArea {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 100000000; i++) {
            int d = (rand.nextInt(2));
            System.out.println(d);
            if (d < 0 || d > 2) {
                throw new OutOfRange(d, 0, 2);
            }
        }
    }
}
