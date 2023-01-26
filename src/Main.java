import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static <List> void main(String[] args) {
        System.out.println("LeetCode 1:");
        System.out.println(Arrays.toString(LeetCode_01_Two_Sum.twoSumSolution1(new int[]{2,7,11,15}, 9)));
        System.out.println();

        System.out.println("LeetCode 217:");
        System.out.println(LeetCode_217_Contains_Duplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        System.out.println();

        System.out.println("LeetCode 448:");
        System.out.println(LeetCode_448_Find_All_Numbers_Disappeared_in_an_Array.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println();

        System.out.println("LeetCode 70:");
        System.out.println(LeetCode_70_Climbing_Stairs.climbStairs(54));
        System.out.println();

        System.out.println("LeetCode 121:");
        System.out.println(LeetCode_121_Best_Time_to_Buy_and_Sell_Stock.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println();

        System.out.println("LeetCode 303:");
        LeetCode_303_2_Range_Sum_Query_Immutable nums = new LeetCode_303_2_Range_Sum_Query_Immutable(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(nums.sumRange(3,5));
        System.out.println();

        System.out.println("LeetCode 338:");
        System.out.println(Arrays.toString(Leetcode_338_Counting_Bits.countBits(5)));
        System.out.println();


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(6);
        linkedList.add(4);

    }
}

