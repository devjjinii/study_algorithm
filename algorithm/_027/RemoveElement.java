package _027;

/*
 * Example 1:
Given nums = [3,2,2,3], val = 3,
Your function should return length = 2, with the first two elements of nums being 2.
It doesn't matter what you leave beyond the returned length.

Example 2:
Given nums = [0,1,2,2,3,0,4,2], val = 2,
Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
Note that the order of those five elements can be arbitrary.
It doesn't matter what values are set beyond the returned length.
 * 
 * */

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println("Output : " +removeElement(nums,val));
	}
	
	 public static int removeElement(int[] nums, int val) {
		  int result = 0;
		  
		  for(int i=0; i<nums.length; i++) {
			  if(nums[i] != val) {
				  nums[result++] = nums[i];
			  }
		  }
		  return result;
		  
	    }
}

/*
*   int tail = 0;
      for (int i = 0, len = nums.length; i < len; ++i) {
          if (nums[i] != val) {
              nums[tail++] = nums[i];
          }
      }
	return tail;
}
* */
