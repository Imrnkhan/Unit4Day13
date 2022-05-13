package Unit4Day13.Question3;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Check Supplied value is greater than 0 or not"
		 		+"\n2: Square of Number"
		 		+"\n3: Know Random Number");
		 int choice = sc.nextInt();
		 int value;
		 
		
		if(choice ==1)
		{
			System.out.println("Enter Number:");
			value = sc.nextInt();
		    Predicate<Integer> p = v->v>0;
		    boolean s = p.test(value);
		    if(s)
		     System.out.println("Number is greater than 0");
		    else 
		     System.out.println("Number is not greater than 0");
		}
		else if(choice==2)
		{
			System.out.println("Enter a number:");
			value = sc.nextInt();
			Predicate<Integer> p = v->v>0;
		    boolean s = p.test(value);
		    if(s)
		    {
				Function<Integer,Integer> f = i1->i1*i1;
				long v = f.apply(value);
			    System.out.println("Square of a Number is:"+v);
		    }
		    else 
		     System.out.println("Number is not greater than 0");
			
		}
		else if(choice ==3)
		{
			Supplier<Integer> getRandom = () -> new Random().nextInt(10000);
			System.out.println("Random number = "+getRandom.get());
			
		}
		else
		{
			System.out.println("Enter valid option");
		}
		
		
	}


}






// Create a customized  calculator using java 8 predefined functional interface
// Perform the following operations only
// And choose the correct predefined function to perform the operations given below:-
// 1. Check if the supplied value is > 0 or not.(using Predicate)
// 2. Square (Function) (int return long)
// 3. Random number generator (supplier)