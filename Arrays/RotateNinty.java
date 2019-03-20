import java.util.*;

public class RotateNinty{
	/***Problem 1.7: Rotate Matrix

	Given an image represented by and MxN matrix, write a method to rotate the image by 90 degrees
		-do it in place

	***/
	

	/***Solution
	
	Do it in layers. With each layer, save top left, and rotate every corner cell clockwise

	Time: O(n^2) - has to go through each element at least once in and MxN
	Space: O(1) - in place solution

	@return true if image m was rotated
	***/
	public boolean rotateNinty(int[][] m){
		//if not a square matrix, return
		if(m.length == 0 || m.length != m[0].length){
			return false;
		}

		int n = m.length;

		for(int layer = 0; layer<n/2; layer++){
			int first = layer;
			int last = n-1-layer;
			for(int i=first; i<last; i++){
				int offset = i-first;
				//save left top left
				int leftT = m[first][i];
				//leftT <- leftB
				m[first][i] = m[last-offset][first];
				//leftB <- rightB
				m[last-offset][first] = m[last][last-offset];
				//rightB <- rightT
				m[last][last-offset] = m[i][last];
				//rightT <- leftT
				m[i][last] = leftT;
			}
		}
		return true;
	}
}