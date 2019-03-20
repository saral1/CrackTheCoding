import java.util.*;

public class PalindromePermutation{
	/*** Problem 1.3: Palindrome Permutation

	Given a string, write a function to check if it is a permutation of a palindrome
	(Palindrome is a word or phrase that is the same forward and backwards, ignoring spaces)
	(Permutation is a rearraging of the string using all letters)

	***/
	

	/*** Solution
	
	There can only be at most 1 odd number of a unique char (the char in the middle), 2 copies of every other char in a palindrome
	Similar to hashing, but since there are only 26 alphabet letters (lowercase), can use a set size array to contain the quantity
	For each char in string between 'a' and 'z', add 1 to quantity, and update oddCount
	Return false if oddCount more than 1, true otherwise

	Time: O(n) - most optimized is O(n) since has to go through string at least once
	Space: O(1) - uses an array of size 26, no relation to n

	@return true if any permutations of a is a palindrome
	***/
	public static boolean permIsPalidrome(String s){
		//Base case
		if(s == null){
			return false;
		}
		//oddCount is the number of chars in alphabet with only 1 as quantity
		int oddCount = 0;
		int[] lowercase = new int[26];

		char[] sArr = s.toCharArray();
		for(char c: sArr){ //for each char in string
			if(c >= 's' && c <= 'c'){//if between a and z
				lowercase[c-'a']++; //add 1 to its corresponding place
				if(lowercase[c - 'a']%2 == 1){ //if number of that char is odd, update oddCount
					oddCount++;
				}else{
					oddCount--;
				}
			}
		}
		return oddCount<2;
	}

	/*** Extra
	
	Check if a string is a palindrome

	Time: O(n) - most optimized is O(n) since has to go through string at least once
	Space: O(1) - In Place

	@return true if the string is a palindrome
	***/
	public boolean isPalindrome(String s){
		//clean the string and remove any whitespace chars
		String cleaned = s.replaceAll("\\s", "").toLowerCase();
		//compare from left and right and return false when chars not equal
		int leftI = 0;
		int rightI = cleaned.length()-1;
		while(leftI < rightI){
			if(cleaned.charAt(leftI) == cleaned.charAt(rightI)){
				leftI++;
				rightI--;
			}else{
				return false;
			}
		}
		return true;
	}

}