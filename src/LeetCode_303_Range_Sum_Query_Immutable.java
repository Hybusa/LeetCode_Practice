public class LeetCode_303_Range_Sum_Query_Immutable {

    int[] nums;

    LeetCode_303_Range_Sum_Query_Immutable(int [] nums)
    {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for(int i=left; i <= right; i++)
        {
            sum+= nums[i];
        }
        return sum;
    }
}
