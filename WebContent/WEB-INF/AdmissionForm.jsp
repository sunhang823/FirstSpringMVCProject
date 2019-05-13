<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <body>
    <h1>${headerMessage}</h1>
    <h1>STUDENT ADMISSION FROM FOR ENGINEERING COURSES</h1>
    
    <form action="/FirstSpringMVCProject/submitAdmissionForm.html" method = "post">
      <p>
        Student's Name : <input type="text" name="studentName"/>
      </p>
      <p>
        Student's Hobby : <input typr="text" name="studentHobby"/>
      </p>
      <input type="submit" value="Submit this form by clicking here">
    </form>

  </body>
</html>