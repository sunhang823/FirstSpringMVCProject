<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <body>
        <link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css" />
        
        <p><a href="/FirstSpringMVCProject/admissionForm.html?siteTheme=green">Green</a> | <a href="/FirstSpringMVCProject/admissionForm.html?siteTheme=red">Red</a></p>
        
        <a href="/FirstSpringMVCProject/admissionForm.html?siteLanguage=en">English</a> | <a href="/FirstSpringMVCProject/admissionForm.html?siteLanguage=ch">Chinese</a>
        
        <h1>${headerMessage}</h1>
        <h3><spring:message code="lable.admissionForm" /></h3>
        
        <form:errors path="student1.*"/>
    
        <form action="/FirstSpringMVCProject/submitAdmissionForm.html" method = "post">
            <table>
                <tr>
                    <td><spring:message code="lable.studentName" /></td><td>            <input type="text" name="studentName"/></td>
                </tr>
                <tr>
                    <td><spring:message code="lable.studentHobby" /></td><td>           <input type="text" name="studentHobby"/></td>
                </tr>
                <tr>
                    <td><spring:message code="lable.studentMobile" /></td><td>          <input type="text" name="studentMobile"/></td>
                </tr>
                <tr>
                    <td><spring:message code="lable.studentDOB" /></td><td>             <input type="text" name="studentDOB"/></td>
                </tr>
                <tr>
                    <td><spring:message code="lable.studentSkills" /></td><td>      <select name="studentSkills" multiple>
                                                                  <option value="Java Core">Java Core</option>
                                                                  <option value="Spring Core">Spring Core</option>
                                                                  <option value="Spring MVC">Spring MVC</option>
                                                              </select></td>
                </tr>
            </table>   
            <table>
                <tr>
                    <td><spring:message code="lable.studentAddress" /></td>
                </tr>
                <tr>
                    <td><spring:message code="lable.country" /><input type="text" name="studentAddress.country"/></td>
                    <td><spring:message code="lable.state" /><input type="text" name="studentAddress.state"/></td>
                    <td><spring:message code="lable.city" /><input type="text" name="studentAddress.city"/></td>
                    <td><spring:message code="lable.street" /><input type="text" name="studentAddress.street"/></td>
                    <td><spring:message code="lable.zipcode" /><input type="text" name="studentAddress.zipcode"/></td>
                </tr>
                <tr>
                    <td>
                        <spring:message code="lable.submit.admissionForm" var="lableSubmitAdmissionForm"></spring:message>
                        <input type="submit" value="${lableSubmitAdmissionForm}"/></td>
                </tr>
            </table>
            
        </form>

  </body>
</html>