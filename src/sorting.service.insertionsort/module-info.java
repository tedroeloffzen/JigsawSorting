module sorting.service.insertionsort {
   requires sorting.service.api;

   provides sorting.service.api.SortingService with sorting.service.insertionsort.InsertionSortService;
}