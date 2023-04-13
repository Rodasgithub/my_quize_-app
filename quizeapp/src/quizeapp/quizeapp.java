
package quizeapp;

import java.util.*;

public class quizeapp 
{

	public static Scanner keyboard = new Scanner(System.in); 
	
	public static void main(String[] args) 
	{
	
		System.out.print("Hello this is maths question app how many question are u interested to work: ");
		double userprompt = keyboard.nextDouble();

		
		
		if (userprompt == 0) 
		{
		    System.out.println("do u not want to work the quize\n");
		    System.exit(0); 
		 }
		    
		if (userprompt < 0) 
		   userprompt = userprompt * -1; 
		
		int r = 0; 
		while (r < userprompt) 		{
		    rondomGenerate(); 		    r++; 
		}
		
		finalresult(); 
		
	}
	
	
	public static void rondomGenerate() 	{
		Random randomgenerated1 = new Random(); 		
                
                Random randomgenerated2 = new Random(); 
		int firstnumber = randomgenerated1.nextInt(10)+1; 
                int secondnumber = randomgenerated1.nextInt(10)+1; 		
                int operandselecter = randomgenerated2.nextInt(3); 

 		calc(firstnumber,secondnumber,operandselecter); 	}
	
	public static int correctanswer = 0; 
        public static int wronganswer = 0;
	
	public static void calc(int first, int second, int third) 	{
		
		double answercollecter = 0; 
		
		if (third == 0) 		{
		    answercollecter = first + second; 
                    System.out.print("What is " +  first + " + " + second + "= "); 
		}
		
		if (third == 1) 		{
		    answercollecter = first - second; 
                    System.out.print("What is " + first + " - " + second + "= "); 		}
		
		if (third == 2) 		{
		   answercollecter = first * second; 
		    System.out.print("What is " + first + " x " + second + "= "); 		}
              
		
		
		double input = keyboard.nextDouble(); 
		
		if (input == answercollecter) 		    {
		    System.out.println("That is correct!\n");
		    correctanswer++; 		    }
		    
		else 		    {
		    System.out.println("That is incorrect! The answer is " + answercollecter + "\n");
		    wronganswer++; 		    }
		       
	}
	
	public static void finalresult() 
	{
		
	System.out.println("The number of questions you answered correctly is " + correctanswer + " and the number you answered incorrectly is " + wronganswer + ".\n");
	}
}


