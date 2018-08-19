<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>STMS - Login</title>
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

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Student Time Management System
                <small class="lightText">STMS</small>
            </h1>

            <%--Show login error if applicable--%>
            <c:if test="${param.error != null}">
                <div class="alert alert-danger alert-dismissible">
                    <strong>Login failed</strong> Username and/or password incorrect.
                </div>
            </c:if>

            <div class="card card-default">
                <div class="card-header">
                    <h3 class="panel-title">
                        <span class="glyphicon glyphicon-log-in"></span>
                        Log In
                    </h3>
                </div>
                <div class="card-body">
                    <form name = "f" action="${pageContext.request.contextPath}/login" method="POST">
                        <%--TODO add autofocus JavaScript to username field--%>
                        <div class="form-group">
                            <input type="text" class="form-control" id="username" name="username" placeholder="Username">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                        </div>
                        <button type="submit" class="btn btn-default">Log In</button>

                        <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}" />
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<p style="margin-bottom:50px;"></p>
</body>
</html>
