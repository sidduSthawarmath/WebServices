package com.siddu.restful.jaxrsjersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.siddu.restful.util.Student;
import com.siddu.restful.util.StudentDao;

@Path("/students")
public class StudentController {

	StudentDao studentDao = new StudentDao();

	// Add student Details
	@POST
	@Path("/save")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Student> save(Student student) {
		return studentDao.addStudent(student);
	}

	// Delete Student details
	@DELETE
	@Path("/{rollNum}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Student> deleteStudent(@PathParam("rollNum") int rollNum) {
		return studentDao.deleteStudentByRollNum(rollNum);
	}

	// Update Student name using rollNum
	@PUT
	@Path("/updateStudentName")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Student> updateStudentName(@QueryParam("rollNum") int rollNum, @QueryParam("name") String name) {
		return studentDao.updateNameByRollNum(rollNum, name);
	}

	// Find all the Student
	@GET
	@Path("/findAll")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Student> findAll() {
		return studentDao.findAllStudents();
	}

	@POST
	@Path("/saveStdDet")
	// @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Student> saveStudent(@FormParam("rollNum") int rollNum, @FormParam("name") String name,
			@FormParam("phoneNum") String phoneNum) {
		Student student = new Student();
		student.setName(name);
		student.setPhoneNum(phoneNum);
		studentDao.addStudent(student);
		return studentDao.findAllStudents();
	}

}