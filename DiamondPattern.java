2.Display this Diamond Pattern -

/* Pattern 2:
              * 
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *    
*/

Logic:

Upper pyramid
Lower Inverted Pyramid
Stars follow: 2*i-1(odd numbers)
Spaces follow: n-i

Code:

package JavaPrograms;

public class DiamondPattern {
	
	public static void main(String[] args) {
		
		int rows = 5;
		
		// Upper Pyramid
		for(int i = 1; i <= rows; i++)  //rows
		{
			//Print spaces
			for(int j = 1; j <= rows - i; j++)
			{
				System.out.print(" ");
			}
			
			//Print stars 
			for(int k = 1; k <= (2 * i - 1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
			
		//Lower Inverted Pyramid
		for(int i = rows- 1; i >= 1; i--)  //rows
		{
			//Print spaces
			for(int j = 1; j <= rows - i; j++)
			{
				System.out.print(" ");
			}
			
			//Print stars 
			for(int k = 1; k <= (2 * i - 1); k++)
			{
				System.out.print("*");
			}
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
 *******
  *****
   ***
    *