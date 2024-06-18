package Lecture_06Array.homework_Ques;

import java.util.ArrayList;
import java.util.*;

public class ThreeTriplet {
    // public static  List<List<Integer>> threeSum(int nums[])
    // {
    //     List<List<Integer>> result = new ArrayList<>();

    //     List<Integer> triplet = new ArrayList<>();
    //     for(int i = 0; i < nums.length;i++)
    //     {
    //         for(int j = i+1; j < nums.length; j++)
    //         {
    //             for(int k = j+1; k < nums.length; k++ )
    //             {
    //                 if(nums[i] + nums[j] + nums[k] == 0)
    //                 {
                        
    //                     triplet.add(nums[i]);
    //                     triplet.add(nums[j]);
    //                     triplet.add(nums[k]);
    //                    // Collections.sort(triplet);
                       
                        
    //                 }
    //             }
    //         }
    //     }
    //     result.add(triplet);
    //     result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
    //     return result;
        
    // }
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();


        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j <  nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> subList = new ArrayList<>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);
                        result.add(subList);
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
