
import java.util.Scanner; 
class something
{
	//Exercise 1.1.11 
	public static void main (String [] args) 
	{ 
		for (int i = 0; i<array1.length(); i++) 
		{
			for (int j = 0 ; j<array2.length(); j++)
			{
				if (something) 
					System.out.print("*"); 
				else 
					System.out.print(" "); 
				if (j==array2.length()-1) 
					System.out.println("\n"); 
			}
		}
	}


	/**Exercse 1.1.5 
	public static void main (String [] args) 
	{ 
		boolean tracing = false; 
		Scanner in = new Scanner(System.in); 
		double temp = 0.0;
		double numbers[] = new double[2]; 

		try 
		{	
			int index = 0; 
			while (index<numbers.length) 
			{ 
				temp = in.nextDouble(); 
				//if (tracing) System.out.println("The thing entered is: "+temp); 
				numbers[index] = temp; 
				index++; 
			}
		}
		catch (Exception e) 
		{
			System.out.println("cannot read input");
		}

		boolean btwn = true; 
		for (int i = 0; i<numbers.length; i++) 
		{
			if (tracing) System.out.println("value of num: "+numbers[i]+ "value of i: "+i); 
			if (numbers[i]<1 && numbers[i]>0) //between 0 and 1
			{
				if (tracing) System.out.println("Made it true");				
				if (i == numbers.length-1) 
				{
					btwn = true; 
				} 
				else
				{	
					btwn=true;
					continue; 
				}
			} 
			else 
			{	
				if (tracing) System.out.println("Made it false");				
				btwn = false; 
				break; 
			} 
		}
		if (btwn) 
			System.out.println("true");
		else
			System.out.println("false"); 
	} //end of main method 
	*/ 

	/**Exercise 1.1.3
	public static void main (String[] args) 
	{ 
		//Read Input 
		boolean tracing = false; 
		Scanner in = new Scanner(System.in); 
		int temp; 
		int [] numbers = new int [3]; 		
		try 
		{
			int index = 0; 
			while (index<numbers.length) 
			{
				temp = in.nextInt(); 
				if (tracing) System.out.println("The thing entered: "+(int) temp); 
				numbers[index] = temp; 
				index++; 
			} //end of while 

			for (int i = 0; i<numbers.length; i++) 
				if (tracing) System.out.print("value is: "+numbers[i]); 

		} //end of try 
		catch (Exception e) 
		{
			System.out.println("Cannot dsplay stuff"); 
		} //end of catch statement		

		//Check Input 

		int tempNum = 0; 
		boolean identical = false; 
		for (int i = 0; i<numbers.length; i++) 
		{ 
			if (i == 0) 
				tempNum = numbers[i]; 
			if (tempNum == numbers[i]) 
			{				
				if (tracing) System.out.println("The numbers match: " +tempNum); 
				if (i == numbers.length-1) identical = true; 
				continue; 
			} 
			else 
			{	
				if (tracing) System.out.println("The numbers do not match "); 
				break; 
			} 

		} //end of for loop 

		if (identical) 
			System.out.println("Equal"); 
		else 
			System.out.println("Not equal"); 

	}

	private void checkInput(int[] numbers)
	{

	} //end of checkInput method 
	*/ 
}