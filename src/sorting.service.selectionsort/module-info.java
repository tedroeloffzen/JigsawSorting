module sorting.service.selectionsort {
   requires sorting.service.api;

   provides sorting.service.api.SortingService with sorting.service.selectionsort.SelectionSortService;
}