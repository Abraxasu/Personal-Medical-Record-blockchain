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


    <p>
        <div class="container">
            <h3>Current Permissions</h3>
    <p>These are people that currently have permission to view your medical records</p>
    <table class="table">
        <thead>
        <tr>
            <th>Alias</th>
            <th>Public Key</th>
            <th>Remove</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Dr Smith, Mediclinic SSW</td>
            <td>0x0bed7abd61247635c1973eb38474a2516ed1d884</td>
            <td>
                <div class="form-check">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">
                    </label>
                </div>
            </td>
        </tr>
        <tr>
            <td>Dr Thompson, Cardiologist</td>
            <td>0xdcc703c0E500B653Ca82273B7BFAd8045D85a470</td>
            <td>
                <div class="form-check">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">
                    </label>
                </div>

            </td>
        </tr>
        <tr>
            <td>Medihelp, Medical aid</td>
            <td>0xdD4ecCd742d17887f50c27aebb14d99bfd7571B6</td>
            <td>
                <div class="form-check">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">
                    </label>
                </div>

            </td>
        </tr>
        </tbody>
    </table>
    <button type="button" class="btn float-right">Remove selected</button>
</div>
</p>

<p>
<div class="container">
    <h3>Add permissions</h3>
    <form action="/action_page.php">
        <div class="form-group">
            <label for="key">Public key:</label>
            <input type="key" class="form-control" id="key">
        </div>
        <div class="form-group form-check">
            <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> I consent to the holder of this public key having access to my medical history
            </label>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>


</div>
</p>

<p>
<div class="container">
    <h3>Research permissions</h3>
    <form action="/action_page.php">
        <div class="form-group form-check">
            <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> I consent to my medical information being accessible to medical researchers
            </label>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>


</div>
</p>
</div>
<p style="margin-bottom:50px;"></p>
</body>
</html>
