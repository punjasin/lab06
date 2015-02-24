<!DOCTYPE html>

<html lang="en" ng-app="labApp">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>My AngularJS App</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="bower_components/html5-boilerplate/css/normalize.css">
    <link rel="stylesheet" href="bower_components/html5-boilerplate/css/main.css">
    <link rel="stylesheet" href="app.css">
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css">
    <script src="bower_components/html5-boilerplate/js/vendor/modernizr-2.6.2.min.js"></script>
    <script src="bower_components/angular/angular.js"></script>
    <script src="bower_components/angular-route/angular-route.js"></script>
    <script src="bower_components/angular-resource/angular-resource.js"></script>
    <script src="bower_components/jquery/dist/jquery.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <script src="app.js"></script>
    <script src="js/controller.js"></script>
    <script src="js/productController.js"></script>
    <script src="js/productService.js"></script>


</head>
<body>
<div class="page-header">
    <h1>CAMT
        <small>Software Component Based Software Development</small>
    </h1>
</div>



<div class="container-fluid">
    <div class="row">
    <div class="col-md-2">
        <!-- Fixed left nav column -->
        <div ng-include src="'template/leftnav.html'"></div>
    </div>
    <div class="col-md-10">
        <!-- Breadcrumbs
       ================================================== -->


            <ng-view>Loading...</ng-view>

    </div>
    </div>
</div>



<!-- In production use:
<script src="//ajax.googleapis.com/ajax/libs/angularjs/x.x.x/angular.min.js"></script>
-->
<script src="components/version/version.js"></script>
<script src="components/version/version-directive.js"></script>
<script src="components/version/interpolate-filter.js"></script>
</body>
</html>
