<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--@elvariable id="mode" type="java.lang.String"--%>
<%--@elvariable id="record" type="com.sbtic.db.data.patient.UserRecord"--%>

<div id="accordion">
    <c:if test="${mode != 'research' && mode != 'pharmacist'}"><%--Researchers don't see personal info--%>
        <div class="card">
            <div class="card-header">
                <a class="card-link" data-toggle="collapse" href="#collapseOne${record.uuid}">
                    Personal Information
                </a>
            </div>
            <div id="collapseOne${record.uuid}" class="collapse show" data-parent="#accordion">
                <div class="card-body">
                    <p>
                        Name:
                        <c:out value="${record.personalInfo.name}"/>
                    </p>
                    <p>
                        Date of birth: <c:out value="${record.personalInfo.dobString}"/>
                    </p>
                    <p>
                        ID number: <c:out value="${record.personalInfo.idNumber}"/>
                    </p>
                    <p>
                        E-mail: <c:out value="${record.personalInfo.emailAddress}"/>
                    </p>
                    <p>
                        Address: <c:out value="${record.personalInfo.address}"/>
                    </p>
                    <p>
                        Emergency Contact: <c:out value="${record.personalInfo.emergencyContact}"/>
                    </p>
                    <p>
                        Gender: <c:out value="${record.personalInfo.gender}"/>
                    </p>
                    <p>
                        Blood Type: <c:out value="${record.personalInfo.bloodType}"/>
                    </p>

                </div>
            </div>
        </div>
    </c:if>

    <div class="card">
        <div class="card-header">
            <a class="collapsed card-link" data-toggle="collapse" href="#collapseTwo${record.uuid}">
                Medical History
            </a>
        </div>
        <div id="collapseTwo${record.uuid}" class="collapse" data-parent="#accordion">
            <div class="card-body">


                <c:if test="${mode != 'pharmacist'}">
                    <div class="card">
                        <div class="card-header">
                            <a class="collapsed card-link" data-toggle="collapse" href="#doctorsVisits${record.uuid}">
                                Doctor's Visits
                            </a>
                        </div>
                        <div id="doctorsVisits${record.uuid}" class="collapse" data-parent="#collapseTwo${record.uuid}">
                            <div class="card-body">
                                <c:forEach var="visit" items="${record.doctorVisits}">
                                    <p>
                                    <h3>
                                        Visit on: <c:out value="${visit.dateString}"/>
                                    </h3>
                                    Hospital: <c:out value="${visit.hospitalName}"/><br>
                                    Hospital Address: <c:out value="${visit.hospitalAddress}"/><br>
                                    Reason for visit: <c:out value="${visit.reasonForVisit}"/><br>
                                    Diagnosis: <c:out value="${visit.diagnosis}"/><br>
                                    Doctor: <c:out value="${visit.doctorID}"/><br>
                                    Tests done: <c:out value="${visit.tests}"/><br>
                                    Medication: <c:out value="${visit.medication}"/><br>
                                    Notes: <c:out value="${visit.notes}"/><br>
                                    </p>
                                </c:forEach>

                            </div>
                        </div>
                    </div>
                </c:if>
                <c:if test="${mode != 'clerk'}">
                    <div class="card">
                        <div class="card-header">
                            <a class="collapsed card-link" data-toggle="collapse" href="#hospitalRecords${record.uuid}">
                                Treatments
                            </a>
                        </div>
                        <div id="hospitalRecords${record.uuid}" class="collapse" data-parent="#collapseTwo${record.uuid}">
                            <div class="card-body">
                                <c:forEach var="history" items="${record.medicalHistory}">
                                    <p>
                                    <h3>
                                        Record: <c:out value="${history.startDateString}"/>
                                    </h3>
                                    Reason: <c:out value="${history.reason}"/><br>
                                    Medication: <c:out value="${history.medication}"/><br>
                                    Notes: <c:out value="${history.notes}"/>
                                    </p>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </c:if>
            </div>
        </div>
    </div>
    <c:if test="${mode != 'nurse' && mode != 'pharmacist' && mode != 'research'}">
        <div class="card">
            <div class="card-header">
                <a class="collapsed card-link" data-toggle="collapse" href="#collapseThree${record.uuid}">
                    Medical Aid
                </a>
            </div>
            <div id="collapseThree${record.uuid}" class="collapse" data-parent="#accordion${record.uuid}">
                <div class="card-body">
                    <p>Company Name: <c:out value="${record.medicalAid.company}"/></p>
                    <p>Plan: <c:out value="${record.medicalAid.plan}"/></p>
                    <p>Dependent: <c:out value="${record.medicalAid.dependentCode}"/></p>
                    <p>Medical Aid Number: <c:out value="${record.medicalAid.number}"/></p>

                </div>
            </div>
        </div>
    </c:if>
</div>