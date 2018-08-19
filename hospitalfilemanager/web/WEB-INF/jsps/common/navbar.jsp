<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark sticky-top">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/">HFM</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/">About</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/info">View</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Edit</a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="button-group">
                <%--<sec:authorize access="!isAuthenticated()">
                    <a class="btn btn-primary" role="button" href="${pageContext.request.contextPath}/login">Login</a>
                    <a class="btn btn-secondary" role="button" href="${pageContext.request.contextPath}/createAccount">Create Account</a>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <a class="btn btn-primary" role="button" href="${pageContext.request.contextPath}/logout">Logout</a>
                </sec:authorize>--%>
            </li>
        </ul>
    </div>
</nav>
