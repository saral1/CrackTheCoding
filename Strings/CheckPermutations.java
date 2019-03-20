import java.util.*;

public class CheckPermutations{
	/*** Problem 1.2: Check Permutation

	Given 2 strings, write a method to decide if one is a permutation of the other

	***/
	

	/*** Solution
	
	Similar to hashing, but since there are only 256 unique chars, can use a set size array to contain the quantity
	Increment quantity for each char found in s1 and decrement for each char in s2
	Return true if all values are 0, else return false

	Time: O(n) - most optimized is O(n) since has to go through string at least once
	Space: O(1) - uses an array of size 256, no relation to n 

	@return true if 2 strings are permutations of each other, false otherwise
	***/
	public boolean CheckPerm(String s1, String s2){
		//first, if length are not even equal, cannot be permutations of each other
		if(s1.length() != s2.length()){
			return false;
		}
		int[] chars = new int[256];
		for(int i=0; i<s1.length(); i++){
			chars[s1.charAt(i)-'a']++;
		}
		for(int i=0; i<s2.length(); i++){
			chars[s2.charAt(i)-'a']--;
		}

		//if there are any non-zero, return false
		for(int i=0; i<256; i++){
			if(chars[i] > 0){
				return false;
			}
		}
		return true;
	}

}