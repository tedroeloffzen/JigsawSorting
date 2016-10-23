module sorting.service.bubblesort {
   requires sorting.service.api;

   provides sorting.service.api.SortingService with sorting.service.bubblesort.BubbleSortService;
}