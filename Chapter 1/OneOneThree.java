Exercise 1.1.3
OneOneThree
{
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

} 