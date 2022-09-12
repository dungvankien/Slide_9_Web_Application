<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>List Of Customers</title>
</head>
<body>
    <h1>Danh Sách Khách Hàng</h1>
    <table border="1px" cellpadding="10px">
        <thead>
            <tr>
                <th>Tên</th>
                <th>Ngày sinh</th>
                <th>Địa chỉ</th>
                <th>Ảnh</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${customersList}" var="item">
                <tr>
                    <td>${item.getFullName()}</td>
                    <td>${item.getBirthDate()}</td>
                    <td>${item.getAddress()}</td>
                    <td><img width="50px" height="60px" src="${item.getImage()}" alt="picture"></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>