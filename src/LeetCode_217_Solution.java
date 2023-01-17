import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_217_Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set= new HashSet<>();

        for(int i:nums)
        {
            if(!set.add(i))
                return true;
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for(int i=1 ; i < nums.length ; i++)
        {
            if(nums[i] == nums[i-1])
            {
                return true;
            }
        }
        return false;
    }
}
