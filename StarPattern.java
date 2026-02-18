1.Display this Star Pattern(Pyramid) -

/* Pattern 1:
              * 
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
*/

Logic:

Each row increases by 2 stars(odd numbers)-1,3,5,7,9
Outer loop- Controls rows
First inner loop- Prints spaces
Second inner loop- Prints stars
Stars formula- 2*1-1

Code:

package JavaPrograms;

public class StarPattern {
	
	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i= 1; i<= rows ; i++)  //rows
		{
			// Print spaces
			for(int j= 1; j<= rows - i; j++)
			{
				System.out.print(" ");
			}
			
			// Print stars (odd numbers: 1,3,5,7,9)

			for(int k= 1; k <= (2 * i -1); k++)
			{
				System.out.print("*");
			}
			
			// Move to next line
			System.out.println();
		}	
	 }
}


Output:

    *
   ***
  *****
 *******
*********


