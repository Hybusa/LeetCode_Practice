public class LeetCode_303_2_Range_Sum_Query_Immutable {

    int [] nums;
    LeetCode_303_2_Range_Sum_Query_Immutable(int [] nums)
    {
        for(int i = 1; i < nums.length; i++)
        {
            nums[i] += nums[i-1];
        }
        this.nums = nums;
    }

    public int sumRange(int left, int right) {

        if(left == 0)
            return nums[right];

        return nums[right] - nums[left-1];
    }
}
