package sorting.service.bubblesort;

import sorting.service.api.SortingService;
import java.util.Arrays;

public class BubbleSortService implements SortingService
{
	private int array[];

	private int length;

	@Override
	public int[] runAlgorithm(int[] unsorted)
	{
		this.array = Arrays.copyOf(unsorted, unsorted.length);
        length = unsorted.length;
        bubble_srt(this.array);
        return this.array;
	}

	// logic to sort the elements
    public void bubble_srt(int array[]) 
    {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
        }
    }
  
    private void swapNumbers(int i, int j, int[] array) 
    {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	@Override
	public String getAlgorithmName()
	{
		return "Bubble sort";
	}
}