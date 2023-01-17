import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("LeetCode 1:");
        LeetCode_01_Solution sol1 = new LeetCode_01_Solution();
        System.out.println(Arrays.toString(sol1.twoSumSolution1(new int[]{2,7,11,15}, 9)));
        System.out.println();

        System.out.println("LeetCode 217:");
        LeetCode_217_Solution sol217 = new LeetCode_217_Solution();
        System.out.println(sol217.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        System.out.println();


        System.out.println("LeetCode 448:");
        LeetCode_448_Solution sol448 = new LeetCode_448_Solution();
        System.out.println(sol448.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println();




    }
}

