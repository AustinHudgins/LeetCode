package Problems;

public class TwoSum {
	/*
	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.

	 

	Example 1:

	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	Example 2:

	Input: nums = [3,2,4], target = 6
	Output: [1,2]
	Example 3:

	Input: nums = [3,3], target = 6
	Output: [0,1]
	 

	Constraints:

	2 <= nums.length <= 104
	-109 <= nums[i] <= 109
	-109 <= target <= 109
	Only one valid answer exists.
	 
	 */	

	    public static int[] twoSum(int[] nums, int target)
	    {
	        int x = 0;
	        int index = 0;
	        int index2 = 1;
	        int[] awnser = {0,0};

	        while(x != target)
	        {
	        	  System.out.println(index + " + " + index2);
	           x = nums[index] + nums[index2];
	           System.out.println(index + " + " + index2 + "= " +  x);
	           if(x == target)
	           {
		           awnser[0] = index;
		           awnser[1] = index2;
	        	   return awnser; 
	           }
	           
	           if(index2 == nums.length-1)
	           {
	        	   System.out.println("over");
	        	   index += 1;
	        	   
	           }
	           index2 ++;
	           
	           x = 0;
	        }
	        return awnser;
	    }
	



}
