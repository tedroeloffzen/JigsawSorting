package sorting.service.api;

import java.util.Objects;
import java.lang.IllegalArgumentException;

public interface SortingService
{
	public default int[] sortArray(int[] unsorted)
	{
		Objects.requireNonNull(unsorted);
		if(unsorted.length == 0)
			throw new IllegalArgumentException("Unsorted array cannot be empty!");

		return runAlgorithm(unsorted);
	}

	public int[] runAlgorithm(int[] unsorted);

	public String getAlgorithmName();
}