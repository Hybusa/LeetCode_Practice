import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LeetCode_01_Solution Sol1 = new LeetCode_01_Solution();
        int [] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(Sol1.twoSumSolution1(nums, target)));
        System.out.println(Arrays.toString(Sol1.twoSumSolution2(nums, target)));
        System.out.println(Arrays.toString(Sol1.twoSumSolution3(nums, target)));
    }
}

