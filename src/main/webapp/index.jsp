<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>职位管理系统</h2>
${requestScope.name}
<a href="">增加</a>
<table border="1" cellpadding="0" cellspacing="0" width="100%">
    <tr style="text-align: center;">
        <td>职位编号</td>
        <td>职位名称</td>
        <td>职位描述</td>
        <td>change</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="list">
        <tr style="text-align: center;">
            <td>${list.id}</td>
            <td>${list.dname}</td>
            <td>${list.des}</td>
            <td>
                <a href="">修改</a>
                <a href="">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
