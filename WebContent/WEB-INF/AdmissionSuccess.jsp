<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>${headerMessage}</h1>
    
        <h3>Congratulations!! The engineering college has processed your Application from successfully</h3>
    
        <h2>Details submitted by you::</h2>
    
    <table>
        <tr>
            <td>Student Name :</td>
            <td>${student1.studentName}</td>
        </tr>
        <tr>
            <td>Student Hobby :</td>
            <td>${student1.studentHobby}</td>
        </tr>
    </table>

  </body>
</html>