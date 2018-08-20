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
    <h3>Associated Clients:</h3>
    <div id="accordionMain">
        <c:forEach var="record" items="${userRecords}">
            <div class="card">
                <div class="card-header">
                    <a class="card-link" data-toggle="collapse" href="#clientList${record.uuid}">
                        Client: <c:out value="${record.personalInfo.name}"/>
                    </a>
                </div>
                <div id="clientList${record.uuid}" class="collapse show" data-parent="#accordionMain">
                    <div class="card-body">
                        <c:set var="record" value="${record}" scope="request"/>
                        <c:set var="mode" value="${mode}" scope="request"/>
                        <jsp:include page="component/clientInfo.jsp"/>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
</p>
<p style="margin-bottom:50px;"></p>
</body>
</html>
