//Exercse 1.1.5 
OneOneFive
{
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
} 
