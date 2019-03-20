import java.util.*;

public class OneAway{
	/*** Problem 1.9: String Rotation

	Assume you have a method called isSubstring
	Check is s2 is a rotation of s1 using one call to isSubstring
		-ie. waterbottle is a rotation of erbottlewat

	***/
	

	/*** Solution
	
	If b is a rotation of a, then b must be found in aa (a+a)

	Time: O(n) - most optimized is O(n) since has to go through string at least once
	Space: O(n) - can be optimized to be in place

	@return true is b is a rotation of a
	***/
	public boolean isRotation(String a, String b){
		int aL = a.length();
		if(b.length() == aL && aL>0){
			String aa = a+a;
			return isSubstring(aa, b);
		}
		return false;
	}
	private boolean isSubstring(String bigger, String smaller){
		if(bigger.indexOf(smaller) >= 0){ //String.indexOf returns index of smaller found in bigger, and -1 if not found
			return true;
		}else{
			return false;
		}
	}
}