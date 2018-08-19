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
            <div id="accordion">

                <div class="card">
                    <div class="card-header">
                        <a class="card-link" data-toggle="collapse" href="#collapseOne">
                            Personal Information
                        </a>
                    </div>
                    <div id="collapseOne" class="collapse show" data-parent="#accordion">
                        <div class="card-body">
                            <p>
                                Name: <c:out value="${record.personalInfo.firstName}"/>
                            </p>
                            <p>
                                Surname: <c:out value="${record.personalInfo.lastName}"/>
                            </p>
                            <p>
                                Date of birth: <c:out value="${record.personalInfo.dob}"/>
                            </p>
                            <p>
                                ID number: <c:out value="${record.personalInfo.idNumber}"/>
                            </p>
                            <p>
                                Emergency Contact: <c:out value="${record.personalInfo.emergencyContact}"/>
                            </p>

                        </div>
                    </div>
                </div>

                <div class="card">
                    <div class="card-header">
                        <a class="collapsed card-link" data-toggle="collapse" href="#collapseTwo">
                            Medical History:
                        </a>
                    </div>
                    <div id="collapseTwo" class="collapse" data-parent="#accordion">
                        <div class="card-body">

                            <div class="card">
                                <div class="card-header">
                                    <a class="collapsed card-link" data-toggle="collapse" href="#medication">
                                        Medication
                                    </a>
                                </div>
                                <div id="medication" class="collapse" data-parent="#collapseTwo">
                                    <div class="card-body">
                                        <p>
                                            Current:
                                        </p>
                                        <p>
                                            Previous:
                                        </p>

                                    </div>
                                </div>
                            </div>

                            <div class="card">
                                <div class="card-header">
                                    <a class="collapsed card-link" data-toggle="collapse" href="#doctorsVisits">
                                        Doctor's Visits
                                    </a>
                                </div>
                                <div id="doctorsVisits" class="collapse" data-parent="#collapseTwo">
                                    <div class="card-body">
                                        <c:forEach var="visit" items="${record.doctorVisits}">
                                            <p>
                                                <h3>
                                                    Visit on: <c:out value="${visit.date}"/>
                                                </h3>
                                                Hospital: <c:out value="${visit.hospitalName}"/><br>
                                                Hospital Address: <c:out value="${visit.hospitalAddress}"/><br>
                                                Reason for visit: <c:out value="${visit.reasonForVisit}"/><br>
                                                Diagnosis: <c:out value="${visit.diagonsis}"/><br>
                                                Doctor: <c:out value="${visit.doctorID}"/><br>
                                                Tests done: <c:out value="${visit.tests}"/><br>
                                                Medication: <c:out value="${visit.medication}"/><br>
                                                Notes: <c:out value="${visit.notes}"/><br>
                                            </p>
                                        </c:forEach>

                                    </div>
                                </div>
                            </div>

                            <div class="card">
                                <div class="card-header">
                                    <a class="collapsed card-link" data-toggle="collapse" href="#hospitalRecords">
                                        Medical History
                                    </a>
                                </div>
                                <div id="hospitalRecords" class="collapse" data-parent="#collapseTwo">
                                    <div class="card-body">
                                        <c:forEach var="history" items="${record.medicalHistory}">
                                            <p>
                                            <h3>
                                                Record: <c:out value="${history.startDate}"/>
                                            </h3>
                                            Reason: <c:out value="${history.reason}"/><br>
                                            Medication: <c:out value="${history.medication}"/><br>
                                            Notes: <c:out value="${history.notes}"/>
                                            </p>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="card">
                    <div class="card-header">
                        <a class="collapsed card-link" data-toggle="collapse" href="#collapseThree">
                            Medical Aid
                        </a>
                    </div>
                    <div id="collapseThree" class="collapse" data-parent="#accordion">
                        <div class="card-body">
                                <p>Company Name: <c:out value="${record.medicalAid.company}"/></p>
                                <p>Plan: <c:out value="${record.medicalAid.plan}"/></p>
                                <p>Dependent: <c:out value="${record.medicalAid.dependentCode}"/></p>
                                <p>Medical Aid Number: <c:out value="${record.medicalAid.number}"/></p>
                                <p>History:<br> <c:out value="${record.medicalAid.usageHistory}"/></p><%--TODO text block for large fields?--%>

                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>

<p style="margin-bottom:50px;"></p>
</body>
</html>
