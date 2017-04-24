angular.module('miApplic', [])
.controller('Hola', function($scope, $http) {
    $http.get('http://localhost:8080/BienvenidaRESTful').
        then(function(response) {
            $scope.bienvenida = response.data;
        });
});