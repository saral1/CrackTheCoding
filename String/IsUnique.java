import java.util.*;

public class IsUnique{
	/***Problem 1.1: IsUnique

	Implement an algorithm to determine is a string has all unique characters. What is you cannot use additional data structures

	***/
	

	/***Solution 1
	
	If additional data structures can be allowed, then the most suitable is a hashset
	Use a loop to run through all chars in the string and insert into hashset, if duplicate is found, return false

	Time: O(n) - most optimized is O(n) since has to go through string at least once
	Space: O(n) - can optimize to in place solution

	@return true if s contains all unqiue characters, false otherwise
	***/
	public boolean IsUnique1(String s){
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s.length(); i++){
			if(set.contains(s.charAt(i))){
				return false;
			}
			set.add(s.charAt(i));
		}
		return true;
	}

	/***Solution 2 (Best)
	
	With no data structure allowed, best to sort the string, and if any 2 consequtive chars are the same, return false

	Time: O(n)  - most optimized is O(n) since has to go through string at least once
	Space: O(1) - in place solution
	
	@return true if s contains all unqiue characters, false otherwise
	***/
	public boolean IsUnque2(String s){
		char[] sArr = s.toCharArray();
		//sort the string
		Arrays.sort(sArr);
		for(int i=0; i<sArr.length-1; i++){
			if(sArr[i] == sArr[i+1]){
				return false;
			}
		}
		return true;
	}
}