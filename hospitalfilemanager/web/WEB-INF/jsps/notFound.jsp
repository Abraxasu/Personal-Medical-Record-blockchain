<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <title>Hospital File Management System</title>
    <%@include file="common/headerIncludes.jsp"%>

    <style>
        .fakeimg {
            height: 200px;
            background: #aaa;
        }
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
            <h5> Patient not found </h5>
            <p>
                The given public key was not found on the Blockchain. Ensure you don't have any typos in your key and <a href="${pageContext.request.contextPath}/login?target=info">try again</a>.
            </p>
        </div>
    </div>
</div>
<p style="margin-bottom:50px;"></p>
</body>
</html>
