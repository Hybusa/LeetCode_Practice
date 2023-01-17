import java.util.Arrays;

public class LeetCode_136_Solution {

    public int singleNumber(int[] nums) {

        int result = 0;

        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

    public int singleNumber2(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {

            if (nums[i] != nums[i + 1])
                return nums[i];
        }
        return nums[nums.length - 1];
    }
}
