package com.datastructure.arrays.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		int [] source = {-7};
		int [] target = sortedSquares(source);
		for(int i=0; i <= target.length-1; i++) {
			System.out.println(target[i]);
		}
		
	}
	
	 public static int[] sortedSquares(int[] nums) {
			int counter1 = 0;
			int counter2 = 0;
			List<Integer> targetNo = new ArrayList<Integer>();
			if (nums[0] >=0) {
				return Arrays.stream(nums).boxed().mapToInt(i -> i*i).toArray();
			} else {
				for(int i=0; i <= nums.length-1; i++) {
					if (nums[i] < 0) {						
						counter1 = i;
						counter2 = i+1;
					}
					nums[i] = nums[i] * nums[i];
				}
			}
			
			while (counter2 <= nums.length-1 && counter1 >= 0) {
				if (nums[counter2] < nums[counter1]) {
					targetNo.add(nums[counter2]);
					counter2++;
				} else {
					targetNo.add(nums[counter1]);
					counter1--;
				}
			}
			
			while (counter2 <= nums.length -1) {
				targetNo.add(nums[counter2]);
				counter2++;
			}
			
			while (counter1 >= 0) {
				targetNo.add(nums[counter1]);
				counter1--;
			}
			
			return targetNo.stream().mapToInt(i -> i).toArray();
	 }

}
