<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

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

    <%--<div class="alert alert-danger alert-dismissible">
        <strong>Login failed</strong> Username and/or password incorrect.
    </div>--%>

    <div class="card card-default">
        <div class="card-header">
            <h3 class="panel-title">
                <span class="glyphicon glyphicon-log-in"></span>
                Log In
            </h3>
        </div>
        <div class="card-body">
            <sf:form name = "f" action="${pageContext.request.contextPath}/${param.target}" method="POST" modelAttribute="loginInfo">
                <div class="form-group">
                    <sf:input type="text" class="form-control" placeholder="Public key" path="publicKey"/>
                </div>
                <c:if test="${param.target != 'clients'}">
                    <div class="form-group form-check-inline">
                        <label class="form-check-label">
                            <sf:radiobutton class="form-check-input" path="loginType" value="patient"/> Patient
                        </label>
                    </div>
                </c:if>
                <div class="form-group form-check-inline">
                    <label class="form-check-label">
                        <sf:radiobutton class="form-check-input" path="loginType" value="doctor"/> Doctor
                    </label>
                </div>
                <c:if test="${param.target != 'clients'}">
                    <div class="form-group form-check-inline">
                        <label class="form-check-label">
                            <sf:radiobutton class="form-check-input" path="loginType" value="nurse"/> Nurse
                        </label>
                    </div>
                    <div class="form-group form-check-inline">
                        <label class="form-check-label">
                            <sf:radiobutton class="form-check-input" path="loginType" value="research"/> Researcher
                        </label>
                    </div>
                    <div class="form-group form-check-inline">
                        <label class="form-check-label">
                            <sf:radiobutton class="form-check-input" path="loginType" value="pharmacist"/> Pharmacist
                        </label>
                    </div>
                </c:if>
                <div class="form-group form-check-inline">
                    <label class="form-check-label">
                        <sf:radiobutton class="form-check-input" path="loginType" value="clerk"/> Clerk
                    </label>
                </div>
                <div>
                    <sf:button type="submit" class="btn btn-default">Log In</sf:button>
                </div>
                <%--<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}" />--%>
            </sf:form>
        </div>
    </div>

</div>
<p style="margin-bottom:50px;"></p>
</body>
</html>
