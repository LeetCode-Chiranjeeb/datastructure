package com.datastructure.arrays.twopointer;

import java.util.Arrays;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		List<String> data = Arrays.asList("abcdcba", "racecar", "Chiranjeeb", "aba");
		data.forEach( record -> {
			char [] dataInArray = record.toCharArray();
			int startPointer = 0;
			int endPointer = dataInArray.length-1;
			boolean isPalindrom = true;
			while(startPointer != endPointer) {
				if (dataInArray[startPointer] != dataInArray[endPointer]) {
					isPalindrom = false;
					break;
				}
				startPointer++;
				endPointer--;
			}
			
			System.out.println(isPalindrom ? record + " Yes Its Palindrom " : record + " Its not a Palindrom ");
		});
		
		
		
		
	}

}
