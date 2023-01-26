import java.util.HashMap;

public class LeetCode_01_Two_Sum {
    public static int[] twoSumSolution1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    public static int[] twoSumSolution2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hashMap.containsKey(nums[i]))
                return new int[]{hashMap.get(nums[i]), i};

            hashMap.put(target - nums[i], i);
        }
        return nums;
    }

    public static int[] twoSumSolution3(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer complementIndex = hashMap.get(nums[i]);
            if (complementIndex != null)
                return new int[]{complementIndex, i};
            hashMap.put(target - nums[i], i);

        }
        return nums;
    }
}

