package C433;

import java.util.ArrayList;

public class LargestElements {

    public ArrayList<Integer> findLargest(ArrayList<Integer> numbers){
        ArrayList<Integer> largest = new ArrayList<>();
        int n = numbers.size();
        for (int i = 1; i < n; i++){
            int key = numbers.get(i);
            int j = i - 1;
            while (j >= 0 && numbers.get(j) > key){
                numbers.set(j+1, numbers.get(j));
                j = j - 1;
            }
        }
        for(int k = 0; k < 10; k++){
            largest.add(numbers.get(n - 1 - k));
        }
        return largest;
    }
}
