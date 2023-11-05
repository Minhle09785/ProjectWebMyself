var app = angular.module("admin",["ngRoute"]);
app.config(function($routeProvider){
    $routeProvider
    .when("/home", {templateUrl:"home.html"})
    .when("/staff", {templateUrl:"staff.html"})
    .when("/product", {templateUrl:"product.html"})
    .otherwise({ redirectTo: "/" });
});