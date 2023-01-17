import java.util.*;

public class LeetCode_448_Solution {

    public ArrayList<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i : nums) {
            int ind = Math.abs(i);
            if (nums[ind - 1] > 0)
                nums[ind - 1] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public ArrayList<Integer> findDisappearedNumbers2(int[] nums) {

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : nums)
            set.add(i);

        for (int i = 1; i < nums.length; i++) {
            if (!set.contains(i))
                result.add(i);
        }
        return result;
    }
}
/* Arrays.sort(nums);

        ArrayList<Integer> noDupes = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != nums[i + 1]) {
                noDupes.add(nums[i]);
            }
        }
        noDupes.add(nums[nums.length - 1]);

        int n = 1;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < noDupes.size(); i++) {
            if (noDupes.get(i) != n) {
                result.add(n);
            }
            n++;
        }*/