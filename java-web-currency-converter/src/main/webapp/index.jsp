<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
    <style>
        input {
            height: 40px;
            width: 300px;
            margin: 10px;
        }
    </style>
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="/convert">
    <label for="myrate">Rate: </label><br>
    <input id="myrate" type="text" name="rate" placeholder="RATE" value="22000"><br>
    <label for="myusd">USD: </label><br>
    <input id="myusd" type="text" name="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="Converter">
</form>
</body>
</html>