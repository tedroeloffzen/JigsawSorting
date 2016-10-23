package sorting.service.mergesort;

import sorting.service.api.SortingService;
import java.util.Arrays;

public class MergeSortService implements SortingService
{
	private int[] array;

    private int[] tempMergArr;

    private int length;

	@Override
	public int[] runAlgorithm(int[] unsorted)
	{
		this.array = Arrays.copyOf(unsorted, unsorted.length);
        this.length = unsorted.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        return array;
	}

	private void doMergeSort(int lowerIndex, int higherIndex) 
	{     
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) 
    {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

	@Override
	public String getAlgorithmName()
	{
		return "Merge sort";
	}
}