<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <title>Hospital File Management System</title>
    <%@include file="common/headerIncludes.jsp"%>

    <style>
        .lightText {
            color: #959595;
        }

        h1, h2, h3, h4, h5, h6 {
            color: black;
        }

        .page-header {
            padding-top: 50px;
        }
    </style>
</head>
<body>


<%@include file="common/navbar.jsp" %>

<div class="container">

    <h1 class="page-header">Personal Medical Records
        <small class="lightText">PMR</small>
    </h1>

    <div class="row">
        <div class="col-lg-12">
            <c:set var="record" value="${record}" scope="request"/>
            <jsp:include page="component/clientInfo.jsp"/>
        </div>
    </div>
</div>

<p style="margin-bottom:50px;"></p>
</body>
</html>
