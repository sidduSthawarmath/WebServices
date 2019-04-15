package com.siddu.restful.jaxrsjersey;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

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

	// Form param example
	@POST
	@Path("/saveStdDet")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Student> saveStudent(@FormParam("rollNum") int rollNum, @FormParam("name") String name,
			@FormParam("phoneNum") String phoneNum) {
		Student student = new Student();
		student.setName(name);
		student.setPhoneNum(phoneNum);
		studentDao.addStudent(student);
		return studentDao.findAllStudents();
	}

	// @QueryParam example
	@GET
	@Path("/findByRollNum")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Student findByRollNum(@QueryParam("rollNum") int rollNum) {
		return studentDao.findStudentByRollNum(rollNum);
	}

	// @QueryParam example
	@GET
	@Path("/headerParam")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String headerParamExample(@HeaderParam("userName") String userName) {
		return userName;
	}

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCookie(@CookieParam("User-Agent") String userAgent) {
		Map<String, Object> cookieMap = new HashMap<String, Object>();
		//cookieMap.put("Last-Accessed", LastAccessed);
		cookieMap.put("User-Agent", userAgent);
		return Response.status(200).entity(cookieMap).build();

	}
	
	
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCookieList(@Context HttpHeaders headers) {
	 
		Map<String, Object> cookieMap = new HashMap<String, Object>();
	 
		for (String key : headers.getCookies().keySet()) {
			Cookie cookie = headers.getCookies().get(key);	
			cookieMap.put(key, cookie.getValue());
		}
		return Response.status(200).entity(cookieMap).build();
	}
}