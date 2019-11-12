package P455;

import java.util.Arrays;

public class P455 {

    public int[] arr = new int[10000];

    public int[] fillArray(int[] arr){
        int max = 25600;
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * ((max - min) + 1)) + min;
        }
        return arr;
    }

    public void run(){
        fillArray(arr);
        //System.out.println(toString(arr));        //removed as printing 1000 entries is mental, there just to prove it worked at 10
        long start = System.nanoTime();
        Arrays.sort(arr);
        System.out.println("Running time of Arrays.sort method: " + (System.nanoTime() - start) + " ns");
        //System.out.println("\nsorted array\n");
        //System.out.println(toString(arr));            //removed as printing 1000 entries is mental, there just to prove it worked at 10
    }

    public String toString(int[] arr){
        String array = "";
        for(int i = 0; i < arr.length; i++){
            array += arr[i] + " ";
        }
        return array;
    }

}
