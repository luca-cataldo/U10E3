/*
Name: DescendingSort
Purpose: Read in a list of integers and sort them in reverse.
Author: Luca Cataldo
Date: 11/25/2019
*/
import java.io.*;

public class DescendingSort
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader keyboardInput = new BufferedReader (
		new InputStreamReader (System.in));

	System.err.print ("How many integers are there? ");
	int listSize = Integer.parseInt (keyboardInput.readLine ());

	if (listSize <= 0) //Check for error.
	{
	    System.err.println ("Invalid list size.");
	    return;
	}

	int[] array = new int [listSize];

	//Input items until the array is full.
	System.err.println ("Enter the integers: ");
	for (int index = 0 ; index < listSize ; index++)
	{
	    array [index] = Integer.parseInt (keyboardInput.readLine ());
	}

	boolean arrayChanged = true;

	// This outer loop controls how many passes
	while (arrayChanged)
	{
	    arrayChanged = false;

	    for (int rightIndex = 1 ; rightIndex < array.length ; rightIndex++)
	    {
		// If the two elements are out of order, swap them.
		if (array [rightIndex] < array [rightIndex - 1])
		{
		    int temp = array [rightIndex];
		    array [rightIndex] = array [rightIndex - 1];
		    array [rightIndex - 1] = temp;
		    arrayChanged = true;
		}
	    }
	}
	//Print the array once the index is full.
	for (int index = array.length - 1 ; index >= 0 ; index--)
	{
	    System.out.println (array [index]);
	}
    }
}
