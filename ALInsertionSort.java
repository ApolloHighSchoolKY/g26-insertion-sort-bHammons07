import java.util.ArrayList;
import java.util.Arrays;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
		sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
		for(int pos = 1; pos < myNumbers.length; pos++)
		{
			inserted = false;
			//Check with each of the numbers in the sorted list
			for(int i = 0; i < sorted.size(); i++)
			{
				//If this number is less than one in the sorted list,
				if(myNumbers[pos] < sorted.get(i))
				{
					//insert it there
					sorted.add(i, myNumbers[pos]);
					inserted = true;
				}
				
			}
				
			//If it was not inserted, stick it on the end.
			if(inserted==false)
			{
				sorted.add(myNumbers[pos]);
			}

		//End Loop for unsorted list
		}
			
		System.out.println(sorted);

		//Move the data back to the array
		for(int mark = 0; mark < sorted.size(); mark++)
		{
			myNumbers[mark] = sorted.get(mark);
		}

		//Print the contents of the array
		System.out.println(Arrays.toString(myNumbers));
    }


}
