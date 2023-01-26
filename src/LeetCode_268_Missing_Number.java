import java.util.Arrays;

public class LeetCode_268_Missing_Number {

    public int missingNumber(int[] nums) {

        int result = nums.length;
        for(int i = 0 ; i< nums.length; i++)
        {
            result ^= i;
            result ^= nums[i];
        }
        return result;
    }

    public int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length ; i++)
        {
            if (i != nums[i])
                result = i;
            else
                result = i+1;
        }
        return result;
    }
}
