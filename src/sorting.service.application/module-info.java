module sorting.service.application {
   requires sorting.service.api;
   requires javafx.base;
   requires javafx.controls;
   requires javafx.swing;

   uses sorting.service.api.SortingService;
}