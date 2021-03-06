package sorting.service.quicksort;

import sorting.service.api.SortingService;
import java.util.Arrays;

public class QuickSortService implements SortingService
{
	private int array[];

	private int length;

	@Override
	public int[] runAlgorithm(int[] unsorted)
	{
		this.array = Arrays.copyOf(unsorted, unsorted.length);
        length = unsorted.length;
        quickSort(0, length - 1);
        return this.array;
	}

	private void quickSort(int lowerIndex, int higherIndex) 
	{     
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) 
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	@Override
	public String getAlgorithmName()
	{
		return "Quick sort";
	}
}