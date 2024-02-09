package com.JDBC_Configuration_Without_XML;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com._1_JDBC_withXML.Student;

public class StudentDAOImpl implements StudentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {

		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

//  1. Insert Data into Table
	@Override
	public void Insert(String name, Integer age) {
		String SQL = "insert into Student (name, age) values (?, ?)";
		jdbcTemplate.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
//		return;
	}

//	2. get single Student from Database
	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplate.queryForObject(SQL, new Object[] { id }, new StudentMapper());
		
//		RowMapper<Student> RM = new StudentMapper();
//		Student student = jdbcTemplate.queryForObject(SQL, RM,id) ;
		
		return student;

	}

//	3. Get All Student from Database
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}

	
//	4. Update Student Data 
	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplate.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
//		return;
	}
	
	
//	5. Update all Data of Student by Id

	public int updateAllData(Student student)
	{
		String SQL = "update Student set name=? , age=? where id=?";
		int updated = jdbcTemplate.update(SQL,student.getName(),student.getAge(), student.getId() );
		
		return updated;
		
	}

//	6. Delete Single studnet using Id
	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
//		return;
	}

}