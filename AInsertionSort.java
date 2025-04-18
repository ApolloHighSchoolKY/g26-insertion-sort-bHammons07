import java.util.Arrays;

public class AInsertionSort
{
        public static void main(String[] args)
    {
        int tempNum = 0;

    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};

        for(int i = 1; i < myNumbers.length; i++)
        {
            for(int j = i - 1; j > 0; j--)
            {
                if(myNumbers[j] < myNumbers[j-1])
                {
                    tempNum = myNumbers[j];
					myNumbers[j] = myNumbers[j-1];
					myNumbers[j-1] = tempNum;
                }
            }
        }
        System.out.println(Arrays.toString(myNumbers));

    }
}
