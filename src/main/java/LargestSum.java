
import java.util.*;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        List<Integer> copy = new ArrayList<>();
        copy = nums;

        // Find 1st largest
        int x = getLargest(copy);

        // Remove the largest from copy
        int idx = copy.indexOf(x);
        copy.remove(idx);

        // Find  2nd largest
        int y = getLargest(copy);

        return x+y;
    }

    public int getLargest(List<Integer> list) {
        int x = list.get(0);
        for (int num : list) {
            if (num > x) {
                x = num;
            }
        }
    return x;
}


}