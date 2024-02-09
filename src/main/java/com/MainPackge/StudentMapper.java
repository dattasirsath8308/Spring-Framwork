package com.MainPackge;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com._1_JDBC_withXML.Student;

/* 
- RowMapper interface is defined in the org.springframework.jdbc.core package.
- It declares a single method: mapRow(ResultSet rs, int rowNum), which is responsible for converting a row of the result set into an object.

	
*/


//Define a class named StudentMapper that implements the RowMapper interface
public class StudentMapper implements RowMapper<Student> {
	
 // Implement the mapRow method to specify how each row of the result set should be mapped to an object.
 public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
     // Create a new instance of the Student class
     Student student = new Student();
     
     // Set the 'id' property of the Student object using the corresponding column value from the result set
     student.setId(rs.getInt("id"));
     
     // Set the 'name' property of the Student object using the corresponding column value from the result set
     student.setName(rs.getString("name"));
     
     // Set the 'age' property of the Student object using the corresponding column value from the result set
     student.setAge(rs.getInt("age"));
     
     // Return the populated Student object
     return student;
 }
}
