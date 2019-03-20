import java.util.*;

public class OneAway{
	/*** Problem 1.5: One Away

	Given 2 strings, write a method to check if they are at most one edits away
	Edits can be:
		-insert a char
		-remove a char
		-replace a char

	***/
	

	/*** Solution
	
	Similar to hashing, but since there are only 256 unique chars, can use a set size array to contain the quantity
	Increment quantity for each char found in s1 and decrement for each char in s2
	Return true if all values are 0, else return false

	Time: O(n) - most optimized is O(n) since has to go through max length of string a or b (string length of a and b off by 1)
	Space: O(1) - In place solution

	@return true if 2 strings are one edit away from each other
	***/
	public boolean oneAway(String a, String b){
		int aL = a.length();
		int bL = b.length();
		//if string length differ by more than 1, return false right away
		if(Math.abs(aL - bL) > 1){
			return false;
		}

		int i=0; //for traversing a
		int j=0; //for traversing b

		boolean skippedOne = false;

		//keep checking a and b
		while(i<aL && j<bL){
			if(a.charAt(i) == b.charAt(j)){
				i++;
				j++;
			}else{
				//no more of a or b
				if(i==aL-1 || j==bL-1){
					return false;
				}
				//check for potential edits if has not skipped one already
				if(a.charAt(i+1) == b.charAt(j) && skippedOne == false){
					i = i+2;
					j++;
					skippedOne = true;
				}else if(a.charAt(i) == b.charAt(j+1) && skippedOne == false){
					j = j+2;
					i++;
					skippedOne = true;
				}else if(a.charAt(i+1) == b.charAt(j+1) && skippedOne == false){
					i = i+2;
					j = j+2;
					skippedOne = true;
				}else{//char dont equal, and has already skipped one
					return false;
				}
			}
		}
		return true;
	}

}