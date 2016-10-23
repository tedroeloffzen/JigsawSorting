package sorting.service.application;

import sorting.service.api.SortingService;

import java.util.ServiceLoader;
import java.util.Date;
import java.util.Random;

public class Application
{
	public static void main(String[] args) 
	{
		int[] arrayLengths = {100, 1000, 10000, 100000};

		for(int arrayLength : arrayLengths)
			runAlgorithmCheck(arrayLength);	
   	}

   	private static void runAlgorithmCheck(int arrayLength)
   	{
   		Iterable<SortingService> services = ServiceLoader.load(SortingService.class);
   		int[] unsorted = generateUnsortedArray(arrayLength);
   		System.out.println("------------------ Running algortihms with length: " + arrayLength + " ------------------");
   		for(SortingService service : services)
   		{
   			String algoritmeNaam = service.getAlgorithmName();
   			long uitvoerTijd = sorteer(unsorted, service);
   			System.out.println(algoritmeNaam + " : " + uitvoerTijd);
   		}
   		System.out.println("------------------ ran algortihms with length: " + arrayLength + " ------------------");
   		System.out.println("");
   	}

   	private static long sorteer(int[] unsorted, SortingService service)
   	{
   		Long beginTijd = System.currentTimeMillis();
   		service.sortArray(unsorted);
   		Long eindTijd = System.currentTimeMillis();

   		return eindTijd - beginTijd;
   	}

   	private static int[] generateUnsortedArray(int length)
   	{
   		int[] unsorted = new int[length];
   		Random random = new Random();

   		for(int i = 0; i < length; i++)
   		{
   			unsorted[i] = random.nextInt();
   		}

   		return unsorted;
   	}
}