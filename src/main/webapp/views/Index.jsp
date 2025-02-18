<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trang chủ</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>Danh sách sản phẩm</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên sản phẩm</th>
                <th>Hãng xe</th>
                <th>Giá</th>
                <th>Số lượng trong kho</th>
                <th>Địa điểm lấy xe</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="item" items="${items}">
                <tr>
                    <td>${item.productID}</td>
                    <td>${item.tenSanPham}</td>
                    <td>${item.hangXe}</td>
                    <td>${item.gia}</td>
                    <td>${item.soLuongTrongKho}</td>
                    <td>${item.diaDiemLayXe}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>