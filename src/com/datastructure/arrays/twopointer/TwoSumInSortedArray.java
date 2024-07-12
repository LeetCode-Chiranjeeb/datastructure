package com.datastructure.arrays.twopointer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TwoSumInSortedArray {

	public static void main(String[] args) {
		
		int[] dataSet = IntStream.of(1, 4, 6, 8, 9, 14, 15).toArray();
		
		int targetNo = 13;
		int startPointer = 0,endPointer = dataSet.length-1;
		boolean matchFound = false;
		while (startPointer != endPointer) {	
			int sumOfPairs = dataSet[startPointer] + dataSet[endPointer];
			if (sumOfPairs == targetNo) {
				matchFound = true;
				break;
			} else if (sumOfPairs > targetNo) {
				endPointer--;
			} else {
				startPointer++;
			}			
		}
		System.out.println(matchFound ? "Match Found @ position " + startPointer + ":" + endPointer : "No Match Found");

	}

}
