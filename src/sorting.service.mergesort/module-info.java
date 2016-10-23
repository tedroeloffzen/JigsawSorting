module sorting.service.mergesort {
   requires sorting.service.api;

   provides sorting.service.api.SortingService with sorting.service.mergesort.MergeSortService;
}