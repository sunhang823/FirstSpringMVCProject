<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>${headerMessage}</h1>
    
        <h3>Congratulations!! The engineering college has processed your Application from successfully</h3>
    
        <h2>Details submitted by you::</h2>
    
    <table>
        <tr>
            <td>Student Name : </td>
            <td>${student1.studentName}</td>
        </tr>
        <tr>
            <td>Student Hobby : </td>
            <td>${student1.studentHobby}</td>
        </tr>
        <tr>
            <td>Student Mobile : </td>
            <td>${student1.studentMobile}</td>
        </tr>
        <tr>
            <td>Student DOB : </td>
            <td>${student1.studentDOB}</td>
        </tr>
        <tr>
            <td>Student Skills : </td>
            <td>${student1.studentSkills}</td>
        </tr>
        <tr>
            <td>Student Address : </td>
            <td>Country: ${student1.studentAddress.country}
                  State: ${student1.studentAddress.state}
                   City: ${student1.studentAddress.city}
                 Street: ${student1.studentAddress.street}
                Zipcode: ${student1.studentAddress.zipcode}</td>
        </tr>
    </table>

  </body>
</html>