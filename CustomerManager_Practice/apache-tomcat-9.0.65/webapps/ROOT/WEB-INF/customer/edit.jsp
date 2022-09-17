<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 9/16/2022
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Customer</title>
    <link rel="stylesheet" href="assets/bootstrap-5.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/bootstrap-5.2.0/css/all.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="javascript:void(0)">Logo</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Link</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Link</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Link</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <form method="post">
                <div class="mb-3" >
                    <label for="ID" class="form-label">ID:</label>
                    <p>
                        <input  value="${requestScope["customer"].getId()}" type="text" class="form-control" name="id" id="ID" required >
                    </p>
                </div>
            <div class="mb-3">
                <label for="Name" class="form-label">Name:</label>
                <p>
                    <input value="${requestScope["customer"].getName()}" type="text" class="form-control" name="name" id="Name" required >
                </p>
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email :</label>
                <p>
                    <input value="${requestScope["customer"].getEmail()}" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" required >

                </p>
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Address:</label>
                <p>
                    <input value="${requestScope["customer"].getAddress()}" type="text" class="form-control" id="exampleInputPassword1" name="address" required >

                </p>
            </div>
            <button type="submit" class="btn btn-primary" value="edit customer">Edit</button>
            <button class="btn btn-primary"><a href="customer" style="color: white"> Comeback Customer List</a></button>
        </form>
        <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="javascript:void(0)">Logo</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Link</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</div>
<script src="assets/bootstrap-5.2.0/js/bootstrap.bundle.js"></script>
<script>
    var popoverTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="popover"]'))
    var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
        return new bootstrap.Popover(popoverTriggerEl)
    })
</script>
</body>
</html>
