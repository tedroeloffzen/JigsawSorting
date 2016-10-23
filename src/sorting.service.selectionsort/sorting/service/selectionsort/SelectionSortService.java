package sorting.service.selectionsort;

import sorting.service.api.SortingService;
import java.util.Arrays;

public class SelectionSortService implements SortingService
{
	@Override
	public int[] runAlgorithm(int[] unsorted)
	{
		int[] array = Arrays.copyOf(unsorted, unsorted.length);
        return doSelectionSort(array);
	}

	private int[] doSelectionSort(int[] arr)
	{     
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

	@Override
	public String getAlgorithmName()
	{
		return "Selection sort";
	}
}