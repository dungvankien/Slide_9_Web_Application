<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
    <style>
        input {
            height: 20px;
            width: 250px;
            margin: 10px;
        }
    </style>
</head>
<body>
<h2>Currency Converter</h2>
<form action="converter.jsp" method="post">
    <label for="rate">Rate: </label><br>
    <input id="rate" type="text" name="rate" placeholder="Rate" value="22000"><br>
    <label for="usd">USD</label><br>
    <input id="usd" type="text" name="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="Converter">
</form>
</body>
</html>