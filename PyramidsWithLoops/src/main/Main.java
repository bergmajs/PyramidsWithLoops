/* 
 * James Bergman
 * bergmajs@mail.uc.edu
 * 09/25/2019
 * Pyramids with Loops
 * github
*/
package main;

public class Main {

	public static void main(String[] args) {
		int rows = 5;		
		for (int i = 1; i <= rows; i++) 
		{			
			for (int j = 1; j <= rows - i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) 
			{
				System.out.print(i + "");
			}
			System.out.println();
		}
	}
}
