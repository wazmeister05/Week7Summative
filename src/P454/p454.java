package P454;

public class p454 {


    int[] testArr = new int[10000];
    public int[] fillArray(int[] testArr){
        int max = 25600;
        int min = 0;
        for(int i = 0; i < testArr.length; i++){
            testArr[i] = (int)(Math.random() * ((max - min) + 1)) + min;
        }
        return testArr;
    }

    public String toString(int[] arr){
        String array = "";
        for(int i = 0; i < arr.length; i++){
            array += arr[i] + " ";
        }
        return array;
    }

    public void run() {
        fillArray(testArr);
        // System.out.println("Array: " + toString(testArr) + "\n");            //commented out as array too large to print after 100

        long start = System.nanoTime();
        System.out.println(example1(testArr));
        System.out.println("Example 1 runtime in ns: " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(example2(testArr));
        System.out.println("Example 2 runtime in ns: " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(example3(testArr));
        System.out.println("Example 3 runtime in ns: " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(example4(testArr));
        System.out.println("Example 4 runtime in ns: " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(example5(testArr, testArr));
        System.out.println("Example 5 runtime in ns: " + (System.nanoTime() - start));
    }

    /*Returns the sum of the integers in given array */
    public static int example1(int[ ] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j++)                   // loop from 0 to n-1
            total += arr[j];
        return total;
        }

        /* Returns the sum of the integers with even index in given array. */
        public static int example2(int[] arr){
            int n = arr.length, total = 0;
            for (int j=0; j < n; j += 2)            // note the increment of 2
                total += arr[j];
            return total;
        }

        /* Returns the sum of the preﬁx sums of given array */
        public static int example3(int[ ] arr) {
            int n = arr.length, total = 0;
            for (int j=0; j < n; j++)           // loop from 0 to n-1
                for (int k=0; k <= j; k++)      // loop from 0 to j
                    total += arr[j];
            return total;
        }

        /* Returns the sum of the preﬁx sums of given array */
        public static int example4(int[ ] arr) {
            int n = arr.length, preﬁx = 0, total = 0;
            for (int j=0; j < n; j++) {         // loop from 0 to n-1
                preﬁx += arr[j];
                total += preﬁx;
            }
            return total;
        }

        /* Returns the number of times second array stores sum of preﬁx sums from ﬁrst */
        public static int example5(int[ ] ﬁrst, int[ ] second) {        // assume equal-length arrays
            int n = ﬁrst.length, count = 0;
            for (int i = 0; i < n; i++) { // loop from 0 to n-1
                int total = 0;
                for (int j = 0; j < n; j++) // loop from 0 to n-1
                    for (int k = 0; k <= j; k++) // loop from 0 to j
                        total += ﬁrst[k];
                if (second[i] == total) count++;
            }
            return count;
        }
}
