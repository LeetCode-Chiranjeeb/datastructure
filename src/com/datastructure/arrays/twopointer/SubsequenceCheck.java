package com.datastructure.arrays.twopointer;

public class SubsequenceCheck {

	public static void main(String[] args) {
		char[] first = "akz".toCharArray(), second = "abkzdfe".toCharArray();
		String source = "akz";
		String target = "";
		
		int fPointer = 0, sPointer= 0;
		
		while(fPointer < first.length && sPointer < second.length) {
			
			
			if (first[fPointer] == second[sPointer]) {
				target = target.concat(String.valueOf(second[sPointer]));
				fPointer++;
				sPointer++;
			} else {
				sPointer++;
			}
			
			if (source.equals(target)) break;
		}
		
		System.out.println("IS subsequence :" + source.equals(target));

	}

}
