package C433;

import java.util.ArrayList;
import java.util.Random;

public class AdamDriver {

    public static void main(String[] args){

        LargestElements le = new LargestElements();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            Random rng = new Random();
            list.add(rng.nextInt());
        }

        long start = System.nanoTime();
        System.out.println(le.findLargest(list));
        System.out.println("The algorithm ran in: " + (System.nanoTime() - start) + " ns");
    }

}
