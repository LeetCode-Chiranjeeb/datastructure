package com.datastructure.arrays.twopointer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SortTwoSortedArray {

	public static void main(String[] args) {
		int[] sortedArraySet1 = IntStream.of(1,4,7,20).toArray();
		int[] sortedArraySet2 = IntStream.of(3,5,5,6,40).toArray();
		List mergedArray = new ArrayList<Integer>();
		
		int firstArrayPointer = 0,secondArrayPointer = 0;
		
		while (firstArrayPointer <= sortedArraySet1.length -1 && secondArrayPointer <= sortedArraySet2.length -1) {
			if (sortedArraySet1[firstArrayPointer] > sortedArraySet2[secondArrayPointer]) {
				mergedArray.add(sortedArraySet2[secondArrayPointer]);
				secondArrayPointer++;
			} else if (sortedArraySet1[firstArrayPointer] < sortedArraySet2[secondArrayPointer] || sortedArraySet1[firstArrayPointer] == sortedArraySet2[secondArrayPointer]) {
				mergedArray.add(sortedArraySet1[firstArrayPointer]);
				firstArrayPointer++;
			}
		}
		
	
		while (secondArrayPointer <= sortedArraySet2.length -1) {
			mergedArray.add(sortedArraySet2[secondArrayPointer]);
			secondArrayPointer++;
		}
		
		while (firstArrayPointer <= sortedArraySet1.length -1) {
			mergedArray.add(sortedArraySet1[firstArrayPointer]);
			firstArrayPointer++;
		}
		
		mergedArray.forEach(action -> System.out.println(action));

	}

}
