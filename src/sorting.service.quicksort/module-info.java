module sorting.service.quicksort {
   requires sorting.service.api;

   provides sorting.service.api.SortingService with sorting.service.quicksort.QuickSortService;
}