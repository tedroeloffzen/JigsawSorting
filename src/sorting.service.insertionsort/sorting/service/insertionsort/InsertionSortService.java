package sorting.service.insertionsort;

import sorting.service.api.SortingService;
import java.util.Arrays;

public class InsertionSortService implements SortingService
{
	@Override
	public int[] runAlgorithm(int[] unsorted)
	{
		int[] array = Arrays.copyOf(unsorted, unsorted.length);
        return doInsertionSort(array);
	}

	private int[] doInsertionSort(int[] input)
	{     
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }

	@Override
	public String getAlgorithmName()
	{
		return "Insertion sort";
	}	
}