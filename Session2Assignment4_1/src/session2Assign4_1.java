/*To Write a program TestDemo.java, which accepts the number as argument and print “You Have Entered Zero” if the value is equal to 0.
		It should print “You Have Entered Positive Value” if the value is greater than 0. It should print “You Have Entered Negative Value” if the value is less than 0.*/
import java.util.*;
public class session2Assign4_1 {
	public static void main (String s[])
	{
		Scanner sc = new Scanner(System.in);  //Taking value from the user
				           
        for (int i=0; i<=2;i++)
        {
              
		System.out.println("Enter the number:- ");
        int no = sc.nextInt();
        if (no == 0)
        	{
        	System.out.println("You Have Entered Zero");
        	}
        else
        	if (no>0)
        		{
        		System.out.println("You Have Entered Positive value.");
        		}
        	else
        		if (no<0)
        			{
        			System.out.println("You Have Entered Negative value.");	
        			}
	}
        sc.close(); 
	 }		
		
}



