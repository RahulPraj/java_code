// We'll use two variables, "count" and "majority," to keep track of the current majority candidate and its count.
// We'll start by assuming the first element in the list as our "majority candidate" and set the count to 1.
// As we traverse through the list, we'll compare each element with the current majority candidate.
// If the current element is the same as the majority candidate, we'll increment the count as we've found another occurrence of this element.
// If the current element is different from the majority candidate, we'll decrement the count as it's like "canceling out" one occurrence of different elements.
// Whenever the count becomes 0, we'll update the majority candidate to the current element and reset the count to 1. This step ensures that we always have a majority candidate at any point in the loop.
// By the end of this process, the majority candidate will hold the element that appears more than half of the time in the list.



package Lecture_06Array.Array_ques.important ques;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int el = 0;
        int n = nums.length;
        
        for(int i = 0;i<n; i++)
        {
            if(count == 0 && el != nums[i])
            {
                el = nums[i];
                count = 1;
            }
            else if(el == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return el;



    }
}
