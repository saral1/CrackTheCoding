import java.util.*;

public class ZeroMatrix{
	/***Problem 1.8: Zero Matrix

	For an MxN matrix, if an element is 0, make its entire row and column 0

	***/
	

	/***Solution
	
	Instead of zeroing rows and cols when a 0 element is found, which could result in zeroing an element twice (wasted effort)
	Better to record all rows and cols that need to zeroed, then waiting till all 0's are found to zero rows and cols
	To avoid hitting some cells more than once when zeroing

	Time: O()
	Space: O()

	@return n/a
	***/
	public void zeroMatrix(int[][] m){
		//rows and cols to be zeroed if true
		boolean[] row = new boolean[m.length];
		boolean[] col = new boolean[m[0].length];

		//find 0 cells
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[0].length; j++){
				if(m[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		//zero rows
		for(int i=0; i<m.length; i++){
			if(row[i] == true){ //i is row that should be set to zero
				//set that whole row to zero
				for(int j=0; j<m[0].length; j++){
					m[i][j] = 0;
				}
			}
		}
		//zero columns
		for(int i=0; i<m[0].length; i++){
			if(col[i] == true){ //i is column that should be set to zero
				//set that whole column to zero
				for(int j=0; j<m.length; j++){
					m[j][i] = 0;
				}
			}
		}
	}
}