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
            <h5> Providing easy access to your medical records to healthcare providers </h5>
            <img src = "static/doc_1.jpg" class="img-fluid mx-auto d-block rounded"/>


            <h2>What is PMR?</h2>
            <p>
                Personal Medical Records is a decentralised way of storing your medical information in a way that is easily accessible to you and your healthcare providers. Using cutting edge Blockchain technology, PMR allows your healthcare providers to view and edit your medical history. This allows you to efficiently transfer accurate and precise information between healthcare providers, saving you and healthcare providers all the admin!
            </p>
            <p>
                Signing up for PMR is easy! Simply click on the log in button and fill in your medical history to date. You will be given your own public and private key which then gives you and healthcare providers access to your information, and from then on medical updates are done automatically by your healthcare provider.
            </p>
        </div>
    </div>
</div>
<p style="margin-bottom:50px;"></p>
</body>
</html>
