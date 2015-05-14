/**
 * Program Name : Lecture.java
 * Purpose : to divide the 2n original string into n substrings of length 2 and to sort in lexicographic order
 * Coder : Bonnie Jung, 0727574
 * Date : May 12, 2015
 */

import java.util.*;

public class Lecture
{
	public static void main(String[] args)
	{//create a scanner to get the number of strings and the strings
		Scanner myInput = new Scanner(System.in);
		int count = myInput.nextInt();
		String inputString = ""; //2n original String
		List<String> inputStringArrayList = new ArrayList<String>();
		
		for(int i = 0; i<count; i++)
		{
		  inputString = myInput.next().toLowerCase();
		  //validate the input to be less than 1000
						if(inputString.length()>1000)
						{
							System.err.println("Test count exceeds max length");
						}
			
			//take the original strings of length 2n ->n substrings of length 2
						for(int j = 0; j<inputString.length(); j +=2)
						{
							inputStringArrayList.add(inputString.substring(j, (j+2)));
						}
						Collections.sort(inputStringArrayList);
						String results = "";
						
						//for each loop to parse every strings in the arrayList
						for(String SubStrings: inputStringArrayList)
						{
							results +=SubStrings;
						}
			System.out.println(results);
			inputStringArrayList.clear();
		}//end of i for loop
		myInput.close();
	}//end of main
}//end class
