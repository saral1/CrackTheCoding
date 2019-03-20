import java.util.*;

public class PaintFill{
	/***Problem 8.10: Paint Fill (Recursive)
	
	Flood fill picture with new color at x and y

	***/


	/***Solution
	
	fill at x and y with newColor if pixel is still previousColor, and recur for each north, east, south and west pixel

	@return n/a
	***/
	public void floodFill(int screen[][], int x, int y, int newColor){
		int prevColor = screen[x][y];
		floodFillUtil(screen, x, y, prevColor, newColor);
	}
	private void floodFillUtil(int screen[][], int x, int y, int prevColor, int newColor){
		if(x<0 || x>=screen.length || y<0 || y>=screen[0].length){ //if outside of screen
			return;
		}
		if(screen[x][y] != prevColor){ //if pixel has been replaced
			return;
		}
		//replace color at x,y
		screen[x][y] = newColor;
		//recur for each north, east, south and west
		floodFillUtil(screen, x+1, y, prevColor, newColor);//south
		floodFillUtil(screen, x-1, y, prevColor, newColor);//north
		floodFillUtil(screen, x, y+1, prevColor, newColor);//east
		floodFillUtil(screen, x, y-1, prevColor, newColor);//west
	}

}